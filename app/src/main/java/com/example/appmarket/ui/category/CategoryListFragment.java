package com.example.appmarket.ui.category;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.appmarket.MainActivity;
import com.example.appmarket.R;
import com.example.appmarket.ResourceManager;
import com.example.appmarket.ui.list.AppListFragment;
import com.example.appmarket.utilities.categories.AppCategories;
import com.example.appmarket.utilities.categories.GameCategories;

import java.util.ArrayList;
import java.util.List;

import static com.example.appmarket.utilities.StaticValues.*;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryListFragment extends Fragment {

    ArrayList<CategoryItem> items;

    public CategoryListFragment(int type) {
        items = new ArrayList<>();
        switch (type) {
            case APP_CAT:
                for (String s : AppCategories.APP_LIST) {
                    items.add(new CategoryItem(s, R.drawable.ic_dashboard_black_24dp)); //TODO give them proper id
                }
                break;
            case GAME_CAT:
            default:
                for (String s : GameCategories.GAME_LIST) {
                    items.add(new CategoryItem(s, R.drawable.ic_dashboard_black_24dp ));
                }
                break;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_category_list, container, false);

        MyAdapter myAdapter = new MyAdapter(getContext(), items);
        ListView listView = root.findViewById(R.id.list_view);
        listView.setAdapter(myAdapter);

        return root;
    }

    private class MyAdapter extends ArrayAdapter {

        ArrayList<CategoryItem> items;

        public MyAdapter(@NonNull Context context, @NonNull List objects) {
            super(context, 0, objects);
            items = (ArrayList) objects;
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @NonNull
        @Override
        public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.category_item, parent, false);
            }
            TextView textView = convertView.findViewById(R.id.category_name);
            textView.setText(items.get(position).name);

            //TODO setIcon

            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ((MainActivity)getContext()).loadFragment(new AppListFragment(ResourceManager.getApps(items.get(position).name)));
                }
            });

            return convertView;
        }
    }

    private class CategoryItem {
        String name;
        int iconSrcID;

        public CategoryItem(String name, int iconSrcID) {
            this.name = name;
            this.iconSrcID = iconSrcID;
        }
    }

}
