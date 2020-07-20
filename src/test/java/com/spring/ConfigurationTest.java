package com.spring;

import com.spring.bean.Person;
import com.spring.config.MyConfigOfpropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class ConfigurationTest {

    AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(MyConfigOfpropertyValues.class);

    @Test
    public void test2(){
        Person person = (Person) ioc.getBean("person");
        System.out.println(person);
        ConfigurableEnvironment environment = ioc.getEnvironment();
        String property = environment.getProperty("person.nickname");
        System.out.println(property);
    }

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
