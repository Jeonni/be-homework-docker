package com.homework.docker.v01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloController {
    @GetMapping(value = "/hello")
    public String rootAPI() {
        return "Hello Docker!";
    }
}
