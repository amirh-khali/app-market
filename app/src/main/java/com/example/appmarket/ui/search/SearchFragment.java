package com.example.appmarket.ui.search;

import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.appmarket.AppInformation;
import com.example.appmarket.MainActivity;
import com.example.appmarket.R;
import com.example.appmarket.ResourceManager;
import com.example.appmarket.ui.list.AppListFragment;
import com.google.android.material.navigation.NavigationView;
import com.mancj.materialsearchbar.MaterialSearchBar;
import com.mancj.materialsearchbar.SimpleOnSearchActionListener;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Set;

public class SearchFragment extends Fragment{

    private MaterialSearchBar materialSearchBar;
    private FrameLayout container;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_search, container, false);

        materialSearchBar = root.findViewById(R.id.search_bar);

        materialSearchBar.setOnSearchActionListener(new MaterialSearchBar.OnSearchActionListener() {

            @Override
            public void onSearchStateChanged(boolean enabled) {

            }

            @Override
            public void onSearchConfirmed(CharSequence text) {

                String myText = text.toString().toLowerCase();
                if (myText.length() == 0) {
                    Toast.makeText(getContext(), "Write something!", Toast.LENGTH_LONG).show();
                    return;
                }

                ArrayList<AppInformation> apps = ResourceManager.getApps();
                ArrayList<Pair<AppInformation, Integer>> appsWithValue = new ArrayList<>();
                for (AppInformation app : apps) {
                    appsWithValue.add(Pair.create(app, 0));
                }

                //set apps search value
                for (int i = 0; i < appsWithValue.size(); ++i) {
                    AppInformation app = appsWithValue.get(i).first;
                    String appName = app.mName.toLowerCase();
                    if (appName.length() >= myText.length() && myText.equals(appName.substring(0, myText.length()))) {
                        appsWithValue.set(i, Pair.create(appsWithValue.get(i).first, appsWithValue.get(i).second + 1));
                    }
                }

                //show apps by value
                Collections.sort(appsWithValue, new Comparator<Pair<AppInformation, Integer>>() {
                    @Override
                    public int compare(Pair<AppInformation, Integer> o1, Pair<AppInformation, Integer> o2) {
                        return o1.second.compareTo(o2.second);
                    }
                });
                ArrayList<AppInformation> appsToShow = new ArrayList<>();
                for (int i = 0; i < appsWithValue.size(); ++i) {
                    if (appsWithValue.get(i).second > 0)
                        appsToShow.add(appsWithValue.get(i).first);
                }

                loadFragment(new AppListFragment(appsToShow));
            }

            @Override
            public void onButtonClicked(int buttonCode) {

            }
        });

        return root;
    }

    public boolean clearSearchPage() {
        FragmentManager fm = getChildFragmentManager();
        boolean isEmpty = (fm.getBackStackEntryCount() == 0);
        for(int i = 0; i < fm.getBackStackEntryCount(); ++i) {
            fm.popBackStack();
        }
        return isEmpty;
    }

    public void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_search_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}