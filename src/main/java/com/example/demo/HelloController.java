package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloController {
    @RequestMapping("/")
    public String requestMethodName() {
        return "Hello world1";
    }
    
}
