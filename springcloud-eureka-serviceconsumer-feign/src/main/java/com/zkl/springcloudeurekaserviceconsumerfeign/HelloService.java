package com.zkl.springcloudeurekaserviceconsumerfeign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "springcloud-eureka-serviceprovider",fallback = HelloServiceHystrix.class)
public interface HelloService {

    @RequestMapping(value="/",method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    String hello(@RequestParam(value="name") String name);

}
