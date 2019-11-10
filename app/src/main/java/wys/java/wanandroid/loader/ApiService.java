package wys.java.wanandroid.loader;



import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import wys.java.wanandroid.moudle.home.HomeItemBean;

public interface ApiService {
    @GET("article/list/{paperIndex}/json")
    Observable<HomeItemBean> getArticle(@Path("paperIndex")int paperIndex);
}
