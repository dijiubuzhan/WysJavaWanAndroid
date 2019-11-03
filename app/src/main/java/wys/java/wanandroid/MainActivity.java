package wys.java.wanandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.youth.banner.Banner;

import java.util.List;

import wys.java.wanandroid.callback.IMainPreenter;
import wys.java.wanandroid.callback.IMainView;
import wys.java.wanandroid.loader.GlideImageLoader;
import wys.java.wanandroid.moudle.home.HomeFragment;
import wys.java.wanandroid.moudle.knowledgeTree.knowledgeTreeFragment;
import wys.java.wanandroid.moudle.navigation.NavigationFragment;
import wys.java.wanandroid.moudle.project.ProjectFragment;
import wys.java.wanandroid.moudle.wxAccounts.WxAccountsFragment;
import wys.java.wanandroid.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener {
    private static final int FRAGMENT_HOME =0 ;
    private static final int FRAGMENT_NAVIGATION =1 ;
    private static final int FRAGMENT_KNOWLEDGETREE =2 ;
    private static final int FRAGMENT_PROJECT =3 ;
    private static final int FRAGMENT_WX_ACCOUNTS =4 ;
    private BottomNavigationView bottomNavigationView;
    private HomeFragment homeFragment;
    private knowledgeTreeFragment mKnowledgeTreeFrag;
    private NavigationFragment navigationFragment;
    private ProjectFragment projectFragment;
    private WxAccountsFragment wxAccountsFragment;
    private int currentIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        bottomNavigationView=findViewById(R.id.design_bottom_sheet);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.home:
                        showFragment(FRAGMENT_HOME);
                        break;
                    case R.id.navigation:
                        showFragment(FRAGMENT_NAVIGATION);
                        break;
                    case R.id.tree:
                        showFragment(FRAGMENT_KNOWLEDGETREE);
                        break;
                    case R.id.project:
                        showFragment(FRAGMENT_PROJECT);
                        break;
                    case R.id.wx_title:
                        showFragment(FRAGMENT_WX_ACCOUNTS);
                        break;
                }
                return true;
            }
        });
    }

    private void showFragment(int fragmentId) {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        hideFragment(fragmentTransaction);
        currentIndex=fragmentId;
        switch (currentIndex){
            case FRAGMENT_HOME:
                if (homeFragment==null) {
                    homeFragment=HomeFragment.newInstance();
                    fragmentTransaction.add(R.id.content,homeFragment,HomeFragment.class.getName());
                }else {
                    fragmentTransaction.show(homeFragment);
                }
                break;
            case FRAGMENT_NAVIGATION:
                if (navigationFragment==null) {
                    navigationFragment=NavigationFragment.newInstance();
                    fragmentTransaction.add(R.id.content,navigationFragment,NavigationFragment.class.getName());
                }else {
                    fragmentTransaction.show(navigationFragment);
                }
                break;
            case FRAGMENT_KNOWLEDGETREE:
                if (mKnowledgeTreeFrag==null) {
                    mKnowledgeTreeFrag=knowledgeTreeFragment.newInstance();
                    fragmentTransaction.add(R.id.content,mKnowledgeTreeFrag,knowledgeTreeFragment.class.getName());
                }else {
                    fragmentTransaction.show(mKnowledgeTreeFrag);
                }
                break;
            case FRAGMENT_PROJECT:
                if (projectFragment==null) {
                    projectFragment=ProjectFragment.newInstance();
                    fragmentTransaction.add(R.id.content,projectFragment,ProjectFragment.class.getName());
                }else {
                    fragmentTransaction.show(projectFragment);
                }
                break;
            case FRAGMENT_WX_ACCOUNTS:
                if (wxAccountsFragment==null) {
                    wxAccountsFragment=WxAccountsFragment.newInstance();
                    fragmentTransaction.add(R.id.content,wxAccountsFragment,WxAccountsFragment.class.getName());
                }else {
                    fragmentTransaction.show(wxAccountsFragment);
                }
                break;
        }
        fragmentTransaction.commit();
    }

    private void hideFragment(FragmentTransaction fragmentTransaction) {
        // 如果不为空，就先隐藏起来
        if (homeFragment != null) {
            fragmentTransaction.hide(homeFragment);
        }
        if (navigationFragment != null) {
            fragmentTransaction.hide(navigationFragment);
        }
        if (mKnowledgeTreeFrag != null) {
            fragmentTransaction.hide(mKnowledgeTreeFrag);
        }
        if (wxAccountsFragment != null) {
            fragmentTransaction.hide(wxAccountsFragment);
        }
        if (projectFragment != null) {
            fragmentTransaction.hide(projectFragment);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }
}
