package com.zkl.springcloudeurekaserviceconsumerfeign;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystrix implements HelloService{
    public String hello(String name) {
        return " fall back. "+name;
    }
}
