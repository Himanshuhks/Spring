package main.java.com.kamal.kishore.spring.ioc.apps.impl;

import main.java.com.kamal.kishore.spring.ioc.apps.IApps;

public class AirtelMoney implements IApps {
    @Override
    public void getServices() {
        System.out.println("Airtel Money Services");
    }

    @Override
    public String toString() {
        return "AirtelMoney";
    }
}
