package com.example.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("SpringCloud-eureka-client")
public interface GreetingConrolller {
    @RequestMapping("/greeting")
    String greeting();
}
