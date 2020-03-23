package com.example.appmarket.ui.list;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appmarket.AppInformation;
import com.example.appmarket.MainActivity;
import com.example.appmarket.R;
import com.example.appmarket.ui.apppage.AppPageFragment;

import java.util.ArrayList;

public class AppListFragment extends Fragment {

    ArrayList<AppInformation> mAppList;

    public AppListFragment(ArrayList<AppInformation> appList) {
        mAppList = appList;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_app_list, container, false);

        RecyclerView rv = view.findViewById(R.id.app_list_recycler_view);
        MyAdapter adapter = new MyAdapter(mAppList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);

        rv.setLayoutManager(gridLayoutManager);
        rv.setAdapter(adapter);

        return view;
    }

    private class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

        ArrayList<AppInformation> mAppList;

        public MyAdapter(ArrayList<AppInformation> appList) {
            mAppList = appList;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.app_small_button, parent, false);

            MyViewHolder viewHolder = new MyViewHolder(v);

            return viewHolder;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, final int position) {
            holder.name.setText(mAppList.get(position).mName);
            holder.logo.setImageResource(mAppList.get(position).mLogoID);

            holder.logo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ((MainActivity)getContext()).loadFragment(new AppPageFragment(mAppList.get(position)));
                }
            });
        }

        @Override
        public int getItemCount() {
            return mAppList.size();
        }
    }

    private class MyViewHolder extends RecyclerView.ViewHolder{

        public ImageView logo;
        public TextView name;

        public MyViewHolder(View itemView) {
            super(itemView);
            logo = itemView.findViewById(R.id.app_logo);
            name = itemView.findViewById(R.id.app_name);
        }
    }

}


