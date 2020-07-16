package com.spring;

import static org.junit.Assert.assertTrue;

import com.spring.bean.Person;
import com.spring.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Arrays;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    ApplicationContext ioc = new AnnotationConfigApplicationContext(MainConfig.class);

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testcolor(){
        print();
        Object colorFactory = ioc.getBean("colorFactory");
        Object colorFactory2 = ioc.getBean("colorFactory");
        System.out.println(colorFactory.getClass());
        System.out.println(colorFactory == colorFactory2);
        Object colorFactory3 = ioc.getBean("&colorFactory");
        System.out.println(colorFactory3.getClass());
    }

    @Test
    public void print(){
        String[] names = ioc.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void test1(){
        System.out.println("容器创建完成");
//        Object person = ioc.getBean("person");
//        System.out.println(person);
    }

    @Test
    public void test12(){
        String[] beanNamesForType = ioc.getBeanNamesForType(Person.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }

        Map<String, Person> beansOfType = ioc.getBeansOfType(Person.class);
        System.out.println(beansOfType);

        Environment environment = ioc.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);
    }
}
