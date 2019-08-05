package com.ezcode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/app.svc")
public class HelloWorld {

    @GetMapping(path = "/hello", produces = "application/json")
    public String Hello() {
        return "Welcome to docker container";
    }
}
