package com.zkl.springcloud_enreka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEnrekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEnrekaServerApplication.class, args);
    }

}
