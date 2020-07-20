package com.spring.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MainAop {

    @Pointcut("execution(public int com.spring.aop.MathCalcuathuar.*(..))")
    public void pointcut(){};

    @Before(value = "pointcut()")
    public void before(){
        System.out.println("before...");
    }

    @After(value = "pointcut()")
    public void after(){
        System.out.println("after...");
    }

    @AfterReturning(value = "pointcut()")
    public void ret(){
        System.out.println("AfterReturning...");
    }

    @AfterThrowing(value = "pointcut()")
    public void exce(){
        System.out.println("AfterThrowing...");
    }
}
