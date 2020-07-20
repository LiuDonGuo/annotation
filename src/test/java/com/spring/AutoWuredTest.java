package com.spring;

import com.spring.aop.MathCalcuathuar;
import com.spring.bean.Boss;
import com.spring.bean.Car;
import com.spring.config.MainConfigAOP;
import com.spring.config.MainConfigAutowire;
import com.spring.config.MainConfigProfile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoWuredTest {

//    AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(MainConfigAutowire.class);
//    AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(MainConfigProfile.class);
    AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(MainConfigAOP.class);

    @Test
    public void test2(){
        print();
        MathCalcuathuar bean = ioc.getBean(MathCalcuathuar.class);
        bean.div(1,1);
    }

    @Test
    public void test(){
        Boss boss = (Boss) ioc.getBean("boss");
        Car car = boss.getCar();
        System.out.println(car);
    }

    public void print(){
        String[] names = ioc.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
