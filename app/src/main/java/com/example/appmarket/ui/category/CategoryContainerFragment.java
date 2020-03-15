package com.example.appmarket.ui.category;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.example.appmarket.R;
import com.example.appmarket.ResourceManager;
import com.example.appmarket.ui.list.AppListFragment;

public class CategoryContainerFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_category_container, container, false);

        FragmentManager manager = getFragmentManager();
        CategoryFragment appListFragment = new CategoryFragment();

        manager.beginTransaction().add(R.id.fragment_category_container, appListFragment).commit();

        return root;
    }

}