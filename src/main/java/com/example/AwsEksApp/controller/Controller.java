package com.example.AwsEksApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1")
public class Controller {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
