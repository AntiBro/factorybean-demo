package com.factorybean.factorybeandemo.factorybean.test;

/**
 * @Author huaili
 * @Date 2018/11/20 16:34
 * @Description TODO
 **/
public class TestB implements Base {

    public TestB(){
        System.out.println("TestB 够着");
    }

    @Override
    public void print() {
        System.out.println("testB bbbb ");
    }
}
