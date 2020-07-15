package com.spring;

import com.spring.bean.Person;
import com.spring.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext ioc = new AnnotationConfigApplicationContext(MainConfig.class);
//        Person person = ioc.getBean(Person.class);
//        Person person = (Person) ioc.getBean("person");
//        System.out.println(person);
        String[] names = ioc.getBeanNamesForType(Person.class);
        System.out.println(Arrays.toString(names));

    }
}
