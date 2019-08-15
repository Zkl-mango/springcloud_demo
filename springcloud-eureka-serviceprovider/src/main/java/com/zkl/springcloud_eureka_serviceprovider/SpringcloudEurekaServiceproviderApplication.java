package com.zkl.springcloud_eureka_serviceprovider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringcloudEurekaServiceproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaServiceproviderApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/")
    public String hello(String name) {
        return String.format("hello %s , from port=%s",name,port);
    }

}
