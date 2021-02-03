package main.java.com.kamal.kishore.spring.ioc.apps.impl;

import main.java.com.kamal.kishore.spring.ioc.apps.IApps;

public class VodafonePlay implements IApps {
    @Override
    public void getServices() {
        System.out.println("Vodafone Play Services");
    }

    @Override
    public String toString() {
        return "VodafonePlay";
    }
}
