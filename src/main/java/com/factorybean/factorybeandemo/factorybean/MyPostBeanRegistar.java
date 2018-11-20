package com.factorybean.factorybeandemo.factorybean;


import com.factorybean.factorybeandemo.factorybean.test.Base;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.Configuration;

/**
 * @Author huaili
 * @Date 2018/11/20 17:15
 * @Description 通过@Configuration 来注入Bean
 **/
@Configuration
public class MyPostBeanRegistar implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {

        System.out.println("postProcessBeanDefinitionRegistry is invoked");

        String clzz= Base.class.getName();


        for(int i=0;i<2;i++){
            if(!beanDefinitionRegistry.containsBeanDefinition(i+""))
                ResgistarUtils.registerBeanDefinations(i+"",clzz,beanDefinitionRegistry);
        }

    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("postProcessBeanFactory is invoked");
    }


}
