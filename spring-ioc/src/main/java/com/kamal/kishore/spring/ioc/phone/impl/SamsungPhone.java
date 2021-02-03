package main.java.com.kamal.kishore.spring.ioc.phone.impl;

import lombok.Getter;
import main.java.com.kamal.kishore.spring.ioc.phone.ISmartPhone;
import main.java.com.kamal.kishore.spring.ioc.sim.ISimNetwork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

import java.util.Objects;

@Getter
public class SamsungPhone implements ISmartPhone {


    ISimNetwork simNetwork;

    @Value("${phone.samsung}")
    String name;

    @Override
    public boolean hasSim() {
        return Objects.nonNull(simNetwork);
    }

    @Override
    public boolean hasNetwork() {
        return false;
    }

    @Required
    public void setSimNetwork(ISimNetwork simNetwork) {
        System.out.println("SETTER LOG");
        this.simNetwork = simNetwork;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SamsungPhone{" +
                "simNetwork=" + simNetwork +
                ", name='" + name + '\'' +
                '}';
    }
}
