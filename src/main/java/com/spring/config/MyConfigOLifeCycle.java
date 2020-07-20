package com.spring.config;

import com.spring.bean.Car;
import org.springframework.context.annotation.*;

@ComponentScan("com.spring.bean")
@Configuration
@Import(MyBeanPostProcessor.class)
public class MyConfigOLifeCycle {

//    @Scope(value = "prototype")
    @Bean(initMethod = "init",destroyMethod = "destory")
    public Car car(){
        return new Car();
    }
}
