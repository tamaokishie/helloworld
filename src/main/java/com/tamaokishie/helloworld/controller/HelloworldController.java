package com.tamaokishie.helloworld.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class HelloworldController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello world!";
    }

}
