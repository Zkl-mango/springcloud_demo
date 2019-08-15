package com.zkl.springcloud_eureka_serviceconsumer_ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/")
    @HystrixCommand(fallbackMethod = "hiFallBack")
    public String hello (String name) {
        return restTemplate.getForObject("http://springcloud-eureka-serviceprovider?name=" + name,String.class);
    }

    public String hiFallBack(String name) {
        return " fall back. "+name;
    }
}
