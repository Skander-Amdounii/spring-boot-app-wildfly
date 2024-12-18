package com.skander.springbootapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    public HelloController() {
    }

    @GetMapping
    public String getString() {
        return "Hello ! This app will be deployed on Wildfly ...";
    }
}