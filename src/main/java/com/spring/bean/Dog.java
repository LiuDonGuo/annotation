package com.spring.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog {

    public Dog() {
        System.out.println("dog constructor...");
    }

    @PostConstruct
    public void PostConstruct(){
        System.out.println("dog PostConstruct...");
    }

    @PreDestroy
    public void PreDestroy(){
        System.out.println("dog PreDestroy...");
    }
}
