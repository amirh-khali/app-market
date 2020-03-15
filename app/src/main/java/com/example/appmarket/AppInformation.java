package com.example.appmarket;

import java.util.ArrayList;

public class AppInformation {

    public String mName;
    public String mCategory;
    public String mDescription;
    public String mDownloadAddress;
    public String mDeveloper;

    public Double mRate;

    public Integer mLogoID;
    public ArrayList<Integer> mImagesID;
    public Integer mSize;
    public Integer mInstalls;

    public AppInformation (String name,
                           String category,
                           String downloadAddress,
                           String developer,
                           Integer logoID,
                           ArrayList<Integer> imagesID,
                           String description) {
        mName = name;
        mCategory = category;
        mDescription = description;
        mDownloadAddress = downloadAddress;
        mDeveloper = developer;
        mRate = 4.5;
        mLogoID = logoID;
        mImagesID = imagesID;
        mSize = 25;
        mInstalls = 100000;
    }

}