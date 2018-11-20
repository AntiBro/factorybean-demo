package com.factorybean.factorybeandemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//选择使用Import来注入bean时
//@Import({MyImportBeanRegistar.class})
public class FactorybeanDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FactorybeanDemoApplication.class, args);
    }
}
