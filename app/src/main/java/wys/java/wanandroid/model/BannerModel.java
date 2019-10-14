package wys.java.wanandroid.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Response;
import wys.java.wanandroid.utils.OkHttpUtils;

public class BannerModel {
    private List<String> imageUrls;
    private static BannerModel instance= new BannerModel();


    public static BannerModel getBannerModel(){
         return instance;
    }

    public void getBannerImageUrls(String url, OkHttpUtils.MyNetCall myNetCall){
        OkHttpUtils.getInstance().getDataAsyn(url, myNetCall);
    }
}
