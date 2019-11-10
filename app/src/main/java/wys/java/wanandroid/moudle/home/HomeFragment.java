package wys.java.wanandroid.moudle.home;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import wys.java.wanandroid.R;
import wys.java.wanandroid.callback.IMainView;
import wys.java.wanandroid.loader.ApiService;
import wys.java.wanandroid.loader.DiffCallback;
import wys.java.wanandroid.loader.GlideImageLoader;
import wys.java.wanandroid.presenter.MainPresenter;
import wys.java.wanandroid.utils.Const;
import wys.java.wanandroid.utils.LogUtil;
import wys.java.wanandroid.utils.RxRetrofitUtil;

import static android.content.ContentValues.TAG;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link HomeFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment implements IMainView {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Banner banner;
    private RecycleAdapter recycleAdapter;
    private RecyclerView recyclerView;
    private OnFragmentInteractionListener mListener;
    private MainPresenter mainPreenter;
    private List<HomeItemBean.DataBean.DatasBean> oldItems=new ArrayList<>();
    private List<HomeItemBean.DataBean.DatasBean> items=new ArrayList<>();
    private int lastItemCount;
    private int paperIndex=0;


    public HomeFragment() {
        // Required empty public constructor
    }


    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainPreenter=new MainPresenter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.frament_home, container, false);
        iniView(view);
        return view;
    }

    private void iniView(View view) {
        banner = (Banner) view.findViewById(R.id.banner);
        //设置图片加载器
        LogUtil.d( "onCreate: "+getActivity()+",,banner="+banner);
        banner.setImageLoader(new GlideImageLoader());
        recyclerView=view.findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                LinearLayoutManager layoutManager= (LinearLayoutManager) recyclerView.getLayoutManager();
                int itemCount=layoutManager.getItemCount();
                int lastPosition=layoutManager.findLastVisibleItemPosition();
                if (lastItemCount!=itemCount && lastPosition==itemCount-1) {
                    lastItemCount=itemCount;
                    loadData();
                }
            }
        });
        recycleAdapter=new RecycleAdapter(getActivity(),items);
        recyclerView.setAdapter(recycleAdapter);
    }

    private void loadData() {
        if (paperIndex!=0) ++paperIndex;
        LogUtil.d("loadData,paperIndex="+paperIndex);
        RxRetrofitUtil.getInstance()
                .baseUrl(Const.HOME_URL)
                .createSApi(ApiService.class)
                .getArticle(paperIndex)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<HomeItemBean>() {
                    @Override
                    public void accept(HomeItemBean homeItemBean) throws Exception {
                       updateData(homeItemBean);
                    }
                });
    }

    private void updateData(HomeItemBean homeItemBean) {
        LogUtil.d("updateData");
        if (items.size()>150) {
            items.clear();
        }
        items.addAll(homeItemBean.getData().getDatas());
        DiffCallback.create(oldItems,items,recycleAdapter);
        oldItems.clear();
        oldItems.addAll(items);
        recyclerView.stopNestedScroll();
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onResume() {
        super.onResume();
        LogUtil.d("onResume");
        mainPreenter.attach(this);
        mainPreenter.getBannerData();
        loadData();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        LogUtil.d("onDetach");
        if (mainPreenter!=null) {
            mainPreenter.detach();
        }
        mListener = null;
    }

    @Override
    public void showBanner(List<String> urls) {
       // LogUtil.d("showBanner,urls="+urls);
        if (urls!=null && urls.size()>0) {
            //设置图片集合
            banner.setImages(urls);
            //banner设置方法全部调用完毕时最后调用
            getActivity().runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    banner.start();
                }
            });
        }
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
