package com.spring.config;


import com.spring.bean.Person;
import com.spring.condition.MacOSCondition;
import com.spring.condition.WindowConditon;
import com.spring.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Configuration
//@ComponentScan(value = "com.spring",excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})
//})
//@ComponentScan(value = "com.spring",includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class}),
//        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookService.class})
//},useDefaultFilters = false)
//@ComponentScan(value = "com.spring",includeFilters = {
//        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})
//},useDefaultFilters = false)
@Conditional(value = {MacOSCondition.class})
public class MainConfig {

    //name 默认用方法名作为name
//    @Scope(value = "prototype")
    @Scope(value = "singleton")
    @Lazy
    @Bean()
    public Person person(){
        System.out.println("向容器中添加bean");
        return new Person("李四",20);
    }

    @Conditional(value = {WindowConditon.class})
    @Bean(value = "bill")
    public Person getPerson(){
        return new Person("bill gates",30);
    }
    @Conditional(value = {MacOSCondition.class})
    @Bean(value = "linux")
    public Person person02(){
        return new Person("linux",30);
    }
}
