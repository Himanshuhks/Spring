package com.hks.BeanAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.hks.BeanAnnotation")
@PropertySource("classpath:student-info.properties")
public class CollegeConfig {
//    public Principal principalBean () {
//        return new Principal();
//    }
//    @Bean(name = "col") // if no name is provided the method name will be the name as a default
//    public College collegeBean() {
//
//        //return new College(principalBean()); // by using constuctor
//        College college = new College(); // by using setter
//        college.setPrincipal(principalBean());
//        return college;
//    }
}
