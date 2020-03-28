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

    public static final int SUBSTRING_FROM_0 = 4;
    public static final int SUBSTRING = 3;
    public static final int SUBSEQUENCE = 2;
    public static final int DESCRIPTION = 1;


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
                ArrayList<Pair<AppInformation, Double>> appsWithValue = new ArrayList<>();
                for (AppInformation app : apps) {
                    appsWithValue.add(Pair.create(app, getSortValue(app, myText)));
                }
                Collections.sort(appsWithValue, new Comparator<Pair<AppInformation, Double>>() {
                    @Override
                    public int compare(Pair<AppInformation, Double> o1, Pair<AppInformation, Double> o2) {
                        return o2.second.compareTo(o1.second);
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

    public static Double getSortValue(AppInformation app, String text) {
        String appName = app.mName.toLowerCase();
        String appDescription = app.mDescription.toLowerCase();
        Double appRate = app.mRate;
        Integer value = 0;
        if (appName.length() >= text.length() && text.equals(appName.substring(0, text.length()))) value += SUBSTRING_FROM_0;
        if (appName.contains(text)) value += SUBSTRING;
        for (int i = 0, j = 0; i < appName.length(); ++i) {
            if (text.charAt(j) == appName.charAt(i)) ++j;
            if (j == text.length()) {
                value += SUBSEQUENCE;
                break;
            }
        }
        if (appDescription.contains(text)) value += DESCRIPTION;

        return value * appRate;
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