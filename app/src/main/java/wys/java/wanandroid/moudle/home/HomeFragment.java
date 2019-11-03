package wys.java.wanandroid.moudle.home;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.youth.banner.Banner;

import java.util.List;

import wys.java.wanandroid.R;
import wys.java.wanandroid.callback.IMainView;
import wys.java.wanandroid.loader.GlideImageLoader;
import wys.java.wanandroid.presenter.MainPresenter;

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
    private OnFragmentInteractionListener mListener;
    private MainPresenter mainPreenter;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
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
        Log.d(TAG, "onCreate: "+getActivity()+",,banner="+banner);
        banner.setImageLoader(new GlideImageLoader());
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
        mainPreenter.attach(this);
        mainPreenter.getBannerData();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        if (mainPreenter!=null) {
            mainPreenter.detach();
        }
        mListener = null;
    }

    @Override
    public void showBanner(List<String> urls) {
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
