package com.dxb.dubbo.dprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dxb.dubbo.dinterface.HelloService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Service//@Service 注解使用的时 Dubbo 提供的而不是 Spring 提供的
public class HelloServiceImpl implements HelloService {
    @Value("${server.port}")
    private int serverPort;

    @Override
    public String sayHello(String name) {
        System.out.println(serverPort);
        return "Hello " + name;
    }
}