package main.java.com.kamal.kishore.spring.ioc.sim.impl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import main.java.com.kamal.kishore.spring.ioc.apps.IApps;
import main.java.com.kamal.kishore.spring.ioc.appstores.IAppStores;
import main.java.com.kamal.kishore.spring.ioc.sim.ISimNetwork;

@Setter
@NoArgsConstructor
public class AirtelNetwork extends ISimNetwork {

    public void makeCall() {
        System.out.println("Airtel Network making call");
    }

    public void useInternet() {
        System.out.println("Airtel Network using Internet");
    }

    @Override
    public String toString() {
        return "AirtelNetwork{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", appStores=" + appStores +
                ", apps=" + apps +
                '}';
    }
}
