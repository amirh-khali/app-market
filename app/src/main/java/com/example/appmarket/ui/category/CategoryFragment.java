package com.example.appmarket.ui.category;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.appmarket.R;
import com.google.android.material.tabs.TabLayout;

import static com.example.appmarket.utilities.StaticValues.*;

public class CategoryFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_category, container, false);
        TabLayout tb = root.findViewById(R.id.tab_layout);
        ViewPager vp = root.findViewById(R.id.view_pager);
        MyPagerAdapter pa = new MyPagerAdapter(getChildFragmentManager(), 0);
        tb.setupWithViewPager(vp);
        vp.setAdapter(pa);

        return root;
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {
        CategoryListFragment game = new CategoryListFragment(GAME_CAT);
        CategoryListFragment app = new CategoryListFragment(APP_CAT);


        public MyPagerAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return app;
                default:
                    return game;
            }
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Apps";
                default:
                    return "Games";
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}