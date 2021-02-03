package main.java.com.kamal.kishore.spring.ioc.sim.impl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import main.java.com.kamal.kishore.spring.ioc.apps.IApps;
import main.java.com.kamal.kishore.spring.ioc.appstores.IAppStores;
import main.java.com.kamal.kishore.spring.ioc.sim.ISimNetwork;

@Setter
public class VodafoneNetwork extends ISimNetwork {

    public VodafoneNetwork(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public void makeCall() {
        System.out.println("Vodafone Network making call");
    }

    public void useInternet() {
        System.out.println("Vodafone Network using Internet");
    }

    @Override
    public String toString() {
        return "VodafoneNetwork{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", appStores=" + appStores +
                ", apps=" + apps +
                '}';
    }
}
