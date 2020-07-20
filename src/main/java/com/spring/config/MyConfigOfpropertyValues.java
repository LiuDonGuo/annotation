package com.spring.config;

import com.spring.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:person.properties")
@Configuration
public class MyConfigOfpropertyValues {

    @Bean
    public Person person(){
        return new Person();
    }


}
