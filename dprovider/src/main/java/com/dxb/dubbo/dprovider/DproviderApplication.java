package com.dxb.dubbo.dprovider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 开启dubbo的自动配置
@EnableDubboConfiguration
public class DproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DproviderApplication.class, args);
    }
}
