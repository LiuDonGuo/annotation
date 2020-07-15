package com.spring.config;


import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class MyTypeFilter implements TypeFilter {
    /**
     *
     * @param metadataReader 读取到的当前类扫描信息
     * @param metadataReaderFactory 可以获取到其他任何类信息的工厂
     * @return
     * @throws IOException
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //当前类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //当前类路径
        Resource resource = metadataReader.getResource();
        //类名称
        String className = classMetadata.getClassName();
        System.out.println("className: " + className);
        System.out.println("resource: " + resource.toString());
        System.out.println();
        if (className.contains("Book"))
            return true;
        return false;
    }
}
