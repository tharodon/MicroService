package com.example.eurekaclient;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class ControllerClass implements GreetingConrolller{
    @GetMapping("/greeting")
    @Override
    public String greeting() {
        return ("Hello from eureka-client!");
    }
}
