package com.starter.ppe.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello World!";
    }
}