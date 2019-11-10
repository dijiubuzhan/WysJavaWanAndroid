package wys.java.wanandroid.presenter;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Response;
import wys.java.wanandroid.bean.BannerBean;
import wys.java.wanandroid.callback.IMainPreenter;
import wys.java.wanandroid.callback.IMainView;
import wys.java.wanandroid.model.BannerModel;
import wys.java.wanandroid.utils.Const;
import wys.java.wanandroid.utils.LogUtil;
import wys.java.wanandroid.utils.OkHttpUtils;

public class MainPresenter extends BasePresenter<IMainView> implements IMainPreenter {
     private List<String> mBannerImageUrls;


    public MainPresenter() {
        mBannerImageUrls=new ArrayList<>();
    }

    @Override
    public void getBannerData() {
      BannerModel.getBannerModel().getBannerImageUrls(Const.BANNER_URL, new OkHttpUtils.MyNetCall() {
          @Override
          public void success(Call call, Response response) throws IOException {
              String str = response.body().string();
             // LogUtil.i("str=" + str);
              BannerBean bannerBean=new Gson().fromJson(str,BannerBean.class);
              if (bannerBean!=null && bannerBean.getData()!=null && bannerBean.getData().size()>0) {
                  for (BannerBean.DataBean dataBean : bannerBean.getData()) {
                      mBannerImageUrls.add(dataBean.getImagePath());
                  }
                 mView.showBanner(mBannerImageUrls);
              }
          }

          @Override
          public void failed(Call call, IOException e) {
              LogUtil.e("IOException e="+e.getMessage());
          }
      });
    }
}
