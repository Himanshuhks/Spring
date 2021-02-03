package main.java.com.kamal.kishore.spring.ioc.phone.impl;

import lombok.Getter;
import main.java.com.kamal.kishore.spring.ioc.phone.ISmartPhone;
import main.java.com.kamal.kishore.spring.ioc.sim.ISimNetwork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.Objects;

@Getter
public class OnePlusPhone implements ISmartPhone {

    @Autowired
    @Qualifier("vodafoneNetwork")
    ISimNetwork simNetwork;

    @Value("${phone.onePlus}")
    String name;

    @Override
    public boolean hasSim() {
        return Objects.nonNull(simNetwork);
    }

    @Override
    public boolean hasNetwork() {
        return false;
    }


    public void setSimNetwork(ISimNetwork simNetwork) {
        System.out.println("One Plus phone setter : simNetwork");
        this.simNetwork = simNetwork;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OnePlusPhone{" +
                "simNetwork=" + simNetwork +
                ", name='" + name + '\'' +
                '}';
    }
}
