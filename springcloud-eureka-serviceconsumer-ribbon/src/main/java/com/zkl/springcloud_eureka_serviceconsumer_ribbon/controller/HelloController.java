package com.zkl.springcloud_eureka_serviceconsumer_ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/")
    public String hello (String name) {
        return restTemplate.getForObject("http://springcloud-eureka-serviceprovider?name=" + name,String.class);
    }
}
