package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class S {
    @GetMapping("/welcome")
    public String welcome(){
        return "Hello World!";
    }
}