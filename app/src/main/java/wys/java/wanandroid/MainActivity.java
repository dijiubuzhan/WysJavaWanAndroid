package wys.java.wanandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.youth.banner.Banner;

import java.util.List;

import wys.java.wanandroid.callback.IMainPreenter;
import wys.java.wanandroid.callback.IMainView;
import wys.java.wanandroid.loader.GlideImageLoader;
import wys.java.wanandroid.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements IMainView {
    private Banner banner;
    private MainPresenter mainPreenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        banner = (Banner) findViewById(R.id.banner);
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        mainPreenter=new MainPresenter();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mainPreenter.attach(this);
        mainPreenter.getBannerData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mainPreenter!=null) {
            mainPreenter.detach();
        }
    }

    @Override
    public void showBanner(List<String> urls) {
        if (urls!=null && urls.size()>0) {
        //设置图片集合
        banner.setImages(urls);
        //banner设置方法全部调用完毕时最后调用
        banner.start();
        }
    }
}
