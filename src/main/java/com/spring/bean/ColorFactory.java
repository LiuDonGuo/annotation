package com.spring.bean;

import org.springframework.beans.factory.FactoryBean;

public class ColorFactory implements FactoryBean<Color> {

    @Override
    public Color getObject() throws Exception {
        System.out.println("ColorFactory。。。getObject()");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
