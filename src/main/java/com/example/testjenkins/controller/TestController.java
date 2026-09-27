package com.example.testjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hi")
    public String hi(){
        return "hi";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
