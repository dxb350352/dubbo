package com.dxb.dubbo.dcomsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dxb.dubbo.dinterface.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference//这个NB了
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        String hello = helloService.sayHello("world");
        return hello;
    }
}
