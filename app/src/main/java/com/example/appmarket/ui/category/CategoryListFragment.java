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

import com.example.appmarket.R;
import com.example.appmarket.values.categories.AppCategories;
import com.example.appmarket.values.categories.GameCategories;

import java.util.ArrayList;
import java.util.List;

import static com.example.appmarket.values.StaticValues.*;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryListFragment extends Fragment {
    ArrayList<CategoryItem> items;

    public CategoryListFragment() {
        // Required empty public constructor
    }

    public CategoryListFragment(int type) {
        items = new ArrayList<>();
        switch (type) {
            case APP_CAT:
                for (String s:AppCategories.APP_LIST) {
                    items.add(new CategoryItem(s, 0)); //TODO give them proper id
                }
                break;
            case GAME_CAT:
            default:
                for (String s: GameCategories.GAME_LIST) {
                    items.add(new CategoryItem(s, 0));
                }break;
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
        Context mContext;
        ArrayList<CategoryItem> mObject;


        public MyAdapter(@NonNull Context context, @NonNull List objects) {
            super(context, 0, objects);
            mContext = context;
            mObject = (ArrayList) objects;
        }

        @Override
        public int getCount() {
            return mObject.size();
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(mContext).inflate(R.layout.category_item, parent, false);
            }
            TextView textView = convertView.findViewById(R.id.category_name);
            textView.setText(mObject.get(position).name);
            //TODO setIcon
            return convertView;
        }
    }

}
