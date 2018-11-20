package com.factorybean.factorybeandemo.factorybean;


import com.factorybean.factorybeandemo.factorybean.test.Base;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author huaili
 * @Date 2018/11/20 16:20
 * @Description 通过@Import({MyImportBeanRegistar.class})来注入Bean
 **/
public class MyImportBeanRegistar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {


        String clzz= Base.class.getName();

        for(int i=0;i<2;i++){
            ResgistarUtils.registerBeanDefinations(i+"",clzz,beanDefinitionRegistry);
        }

    }

}
