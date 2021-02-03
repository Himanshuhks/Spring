package com.hks.BeanAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
// for any class implementing an interface the @primary annotation makes it primary implementation but can be changed by using @Qualifier annotation
// any other implementation can be taken
@Component("collegeBean")
public class College {

//    @Value("${college}")
    @Value("${college}")
    public String collegeName;


    @Autowired
    private Principal principal;


    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public College() {
    }

    public College(Principal principal) {
        this.principal = principal;
    }

    public void test() {
        principal.print();
        System.out.println("Test function called");
        System.out.println(collegeName);
    }
}
