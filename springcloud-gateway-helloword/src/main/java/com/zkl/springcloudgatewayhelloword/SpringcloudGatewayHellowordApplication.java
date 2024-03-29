package com.zkl.springcloudgatewayhelloword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
public class SpringcloudGatewayHellowordApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudGatewayHellowordApplication.class, args);
    }

//    @Bean
//    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//        return builder.routes().route(
//                p->p
//                .path("/get")
//                .filters(f->f.addRequestHeader("Hello","World"))
//                .uri("http://httpbin.org:80")
//        ).route("hystrix-route",
//                p->p
//                .host("*.abc.com")
//                .filters(f->f.hystrix(config -> config
//                    .setName("mycmd")
//                    .setFallbackUri("forward:/fallback")))
//                .uri("http://httpbin.org:80"))
//                .build();
//    }


    @RequestMapping("/fallback")
    public Mono<String> fallback() {
        return Mono.just("fallback");
    }

}
