package com.alberto.e_commerce.application.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping("/")
    public String home(){
        return ("Hello your Application is running at port: 8080");
    }
}
