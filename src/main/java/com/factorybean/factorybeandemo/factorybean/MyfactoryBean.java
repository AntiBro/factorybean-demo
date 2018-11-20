package com.factorybean.factorybeandemo.factorybean;


import com.factorybean.factorybeandemo.factorybean.test.TestA;
import com.factorybean.factorybeandemo.factorybean.test.TestB;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author huaili
 * @Date 2018/11/20 16:14
 * @Description 自定义factoryBean
 **/
public class MyfactoryBean implements FactoryBean<Object> {
    public Class<?> getType() {
        return type;
    }

    public void setType(Class<?> type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Class<?> type;
    private String name;

    @Override
    public Object getObject() throws Exception {
        System.out.println("getObject");
        if(this.name.equals("0")){
            return new TestA();
        }else if(this.name.equals("1")){
            return new TestB();

        }
       throw new ClassNotFoundException("not found Base by name=["+name+"]");
    }

    @Override
    public Class<?> getObjectType() {
        return type;
    }

}
