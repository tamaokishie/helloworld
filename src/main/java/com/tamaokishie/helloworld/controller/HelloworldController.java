package com.tamaokishie.helloworld.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloworldController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello world!";
    }

}
