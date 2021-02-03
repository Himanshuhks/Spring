package com.hks.BeanAnnotation;

import org.springframework.stereotype.Component;

@Component("prin")
public class Principal {
    public void print() {
        System.out.println("Hello World");
    }
}
