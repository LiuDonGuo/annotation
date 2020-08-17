package com.spring.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

import java.util.Arrays;

public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("postProcessBeanDefinitionRegistry...");
        int beanDefinitionCount = registry.getBeanDefinitionCount();
        System.out.println(Arrays.asList(registry.getBeanDefinitionNames()));
        System.out.println("beanDefinitionCount: " + beanDefinitionCount);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor...");
        System.out.println(Arrays.asList(beanFactory.getBeanDefinitionNames()));
        System.out.println("beanDefinitionCount: " + beanFactory.getBeanDefinitionCount());
    }
}
