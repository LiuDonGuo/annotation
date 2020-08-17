package com.spring.web.config;

import org.springframework.stereotype.Service;

@Service
public class UserService {


    public String sayHello(String s) {
        System.out.println(s);
        return s;
    }
}
