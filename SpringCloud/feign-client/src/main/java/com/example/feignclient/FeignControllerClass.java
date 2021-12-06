package com.example.feignclient;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class FeignControllerClass implements GreetingConrolller{
    @Override
    public String greeting() {
        return ("Hello from eureka-client!");
    }
}
