package com.example.appmarket.ui.appcontainer;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.appmarket.AppInformation;
import com.example.appmarket.R;
import com.example.appmarket.ui.list.AppListFragment;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AppPageFragment extends Fragment {
    private AppInformation mAppInformation;

    public AppPageFragment(AppInformation appInformation) {
        mAppInformation = appInformation;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_app_page, container, false);

        ImageView appLogo = root.findViewById(R.id.app_picture);
        TextView appName = root.findViewById(R.id.app_name);
        TextView appDeveloper = root.findViewById(R.id.app_developer);
        TextView description = root.findViewById(R.id.description);
        TextView rate = root.findViewById(R.id.app_rate);
        TextView apkSize = root.findViewById(R.id.app_apk_size);
        TextView appCategory = root.findViewById(R.id.app_category);
        TextView count = root.findViewById(R.id.app_count_of_download);



        if (mAppInformation != null) {
            appLogo.setImageResource(mAppInformation.mLogoID);
            appName.setText(mAppInformation.mName);
            appDeveloper.setText(mAppInformation.mDeveloper);
            description.setText(mAppInformation.mDescription);
            rate.setText(mAppInformation.mRate + "/5");

            double size = (double)mAppInformation.mSize;
            apkSize.setText(size > 1024? String.format("%.1f GB", size / 1024): (mAppInformation.mSize + " MB"));

            appCategory.setText(mAppInformation.mCategory);
            count.setText("+"+mAppInformation.mRate);

            RecyclerView rv = root.findViewById(R.id.recycler_view_image);

            MyAdapter adapter = new MyAdapter(mAppInformation.mImagesID);

            LinearLayoutManager manager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

            rv.setLayoutManager(manager);
            rv.setAdapter(adapter);

        }
        return root;
    }


    private class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {


        ArrayList<Integer> mArray;

        public MyAdapter(ArrayList<Integer> array) {
            mArray = array;
        }

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new MyViewHolder(new ImageView(parent.getContext()));
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.logo.setImageResource(mArray.get(position));
        }


        @Override
        public int getItemCount() {
            return mArray.size();
        }
    }
    private class MyViewHolder extends RecyclerView.ViewHolder{

        public ImageView logo;

        public MyViewHolder(View itemView) {
            super(itemView);
            logo = (ImageView) itemView;
            logo.setScaleType(ImageView.ScaleType.FIT_XY);
//            logo.getLayoutParams().height = RecyclerView.LayoutParams.MATCH_PARENT;
//            logo.getLayoutParams().width = 300; //TODO THIS IS A TOTAL MESS YOU NEED TO CONFIGURE DP AND FIX IT ITS JUST FOR WORKING RIGHT NOW

        }
    }
}
