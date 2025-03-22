package com.starter.starter_spring_project.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello World!";
    }
}