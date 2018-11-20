package com.factorybean.factorybeandemo.factorybean.test;

/**
 * @Author huaili
 * @Date 2018/11/20 16:33
 * @Description TODO
 **/
public class TestA implements Base {

    public TestA(){
        System.out.println("TestA 够着");
    }
    @Override
    public void print() {
        System.out.println("testA aaa");
    }
}
