package com.example;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;

@Controller
public class DemoController implements InitializingBean, DisposableBean {

    public DemoController() {
        System.out.println("in DemoController Constructor");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("in afterPropertiesSet method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("in destroy method");
    }

    // -- modern and alternative way instead of using that bloody interfaces --

//    @PostConstruct
//    public void greet(){
//        System.out.println("in post constructor method");
//    }
//
//    @PreDestroy
//    public void destroy(){
//        System.out.println("in preDestroy method");
//    }
}
