package com.zkl.springcloudeurekaserviceconsumerfeign;

import com.zkl.springcloudeurekaserviceconsumerfeign.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/")
    public String hello(String name) {
        return helloService.hello(name);
    }
}
