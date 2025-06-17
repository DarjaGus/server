package com.example.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("Received request to /hello");
        return "Hello, world!";
    }

    @GetMapping("/login")
    public String login() {
        System.out.println("Received request to /login");
        return "Login page";
    }
}