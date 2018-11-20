package com.factorybean.factorybeandemo.factorybean;

import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;

/**
 * @Author huaili
 * @Date 2018/11/20 17:26
 * @Description TODO
 **/
public class ResgistarUtils {

    /**
     * 注册工具类方法
     * @param className
     * @param clzz
     * @param beanDefinitionRegistry
     */
    public static void  registerBeanDefinations(String className, String clzz, BeanDefinitionRegistry beanDefinitionRegistry){


        /**
         * 通过 工厂方法来注入Bean
         */
        BeanDefinitionBuilder builder= BeanDefinitionBuilder.genericBeanDefinition(MyfactoryBean.class);

        builder.addPropertyValue("type",clzz);
        builder.addPropertyValue("name",className);
        builder.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);

        AbstractBeanDefinition beanDefinition = builder.getBeanDefinition();
        if(className.equals("0")) {
            beanDefinition.setPrimary(true);
        }else{
            //beanDefinition.s
        }

        BeanDefinitionHolder holder = new BeanDefinitionHolder(beanDefinition, className);
        BeanDefinitionReaderUtils.registerBeanDefinition(holder, beanDefinitionRegistry);
    }
}
