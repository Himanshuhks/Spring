package main.java.com.kamal.kishore.spring.ioc.appstores.impl;

import main.java.com.kamal.kishore.spring.ioc.appstores.IAppStores;

public class GooglePlayStore implements IAppStores {
    @Override
    public void getApps() {
        System.out.println("Google Play Store -> get Apps");
    }

    @Override
    public String toString() {
        return "GooglePlayStore";
    }
}
