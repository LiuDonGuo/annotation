package com.spring.config;

import com.spring.aop.MainAop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(value = "com.spring.aop")
public class MainConfigAOP {

//    @Bean
//    public MainAop mainAop(){
//        return new MainAop();
//    }
}
