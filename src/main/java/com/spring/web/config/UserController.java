package com.spring.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        String hello = userService.sayHello("tomcat...");
        return hello;
    }

    @RequestMapping("/suc")
    public String success(){
        return "success";
    }
}
