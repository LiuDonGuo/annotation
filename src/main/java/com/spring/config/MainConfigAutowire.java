package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"com.spring.controller","com.spring.service","com.spring.dao","com.spring.bean"})
public class MainConfigAutowire {
}
