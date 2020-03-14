package com.example.appmarket;

public class AppInformation {
    double cost ;
    String src ;
    String appName;


    public AppInformation(String appName, String src , double cost) {
        this.appName = appName;
        this.cost = cost;
        this.src = src;

    }
}