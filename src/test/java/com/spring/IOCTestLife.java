package com.spring;

import com.spring.config.MyConfigOLifeCycle;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTestLife {
    AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(MyConfigOLifeCycle.class);

    @Test
    public void test(){
        print();
        ioc.close();
    }

    public void print(){
        String[] names = ioc.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
