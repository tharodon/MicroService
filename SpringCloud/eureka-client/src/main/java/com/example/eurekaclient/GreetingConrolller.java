package com.example.eurekaclient;

import org.springframework.web.bind.annotation.RequestMapping;

public interface GreetingConrolller {
    @RequestMapping("/greeting")
    String greeting();
}
