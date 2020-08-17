package com.spring;

import com.spring.config.TXConfig;
import com.spring.ext.ExtConfig;
import com.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TXText {
    AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(ExtConfig.class);

    @Test
    public void test(){
//        System.out.println(ioc);
        ioc.publishEvent(new ApplicationEvent("我发布的事件") {
        });

        ioc.close();
    }

}
