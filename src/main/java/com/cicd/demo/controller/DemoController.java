package com.cicd.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/hi")
    public String hi() {
        return "Hi";
    }

}
