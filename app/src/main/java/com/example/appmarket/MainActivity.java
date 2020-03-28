package com.example.appmarket;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.appmarket.ui.category.CategoryFragment;
import com.example.appmarket.ui.list.AppListFragment;
import com.example.appmarket.ui.search.SearchFragment;
import com.example.appmarket.ui.setting.SettingFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private ActionBar toolbar;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //add fake resource
        new ResourceManager();

        toolbar = getSupportActionBar();
        bottomNavigationView = findViewById(R.id.nav_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment;
                clearBackStack();
                switch (menuItem.getItemId()) {
                    case R.id.navigation_home:
                        toolbar.setTitle(getString(R.string.title_home));
                        loadFragment(new AppListFragment(ResourceManager.getApps()));
                        return true;
                    case R.id.navigation_search:
                        toolbar.setTitle(getString(R.string.title_search));
                        loadFragment(new SearchFragment());
                        return true;
                    case R.id.navigation_category:
                        toolbar.setTitle(getString(R.string.title_category));
                        loadFragment(new CategoryFragment());
                        return true;
                    case R.id.navigation_setting:
                        toolbar.setTitle(getString(R.string.title_setting));
                        loadFragment(new SettingFragment());
                        return true;
                }
                return false;
            }
        });

        toolbar.setTitle(getString(R.string.title_home));
        loadFragment(new AppListFragment(ResourceManager.getApps()));

        toolbar.hide();
    }

    @Override
    public void onBackPressed() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        if (fragmentManager.getBackStackEntryCount() > 1) {
            fragmentManager.popBackStackImmediate();
        } else {
            Fragment fragment = fragmentManager.findFragmentByTag(SearchFragment.class.getSimpleName());
            boolean finish = true;
            if (fragment != null) {
                finish = ((SearchFragment)fragment).clearSearchPage();
            }
            if (finish)
                supportFinishAfterTransition();
        }
    }

    private void clearBackStack() {
        FragmentManager fm = getSupportFragmentManager();
        for(int i = 0; i < fm.getBackStackEntryCount(); ++i) {
            fm.popBackStack();
        }
    }

    public void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment, fragment.getClass().getSimpleName());
        transaction.addToBackStack(null);
        transaction.commit();
    }

}
