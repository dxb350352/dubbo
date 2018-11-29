package com.dxb.dubbo.dcomsumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class DcomsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DcomsumerApplication.class, args);
    }
}
