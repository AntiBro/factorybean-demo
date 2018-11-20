package com.factorybean.factorybeandemo.factorybean;


import com.factorybean.factorybeandemo.factorybean.test.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @Author huaili
 * @Date 2018/11/20 17:39
 * @Description 测试
 **/
@RestController
public class TestController {

    @Autowired
    Base base1;

//    @Autowired
//    @Qualifier("1")
    @Resource(name = "1")
    Base base2;

    @GetMapping("/testprint")
    public String print(){
        base1.print();
        base2.print();
        return "testprint";
    }
}
