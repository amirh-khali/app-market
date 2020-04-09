package com.example.appmarket.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.appmarket.MainActivity;
import com.example.appmarket.R;
import com.example.appmarket.ResourceManager;
import com.example.appmarket.ui.list.AppListFragment;

public class HomeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        loadFragment(new AppListFragment(ResourceManager.getApps()));

        return root;
    }

    public void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_home_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}