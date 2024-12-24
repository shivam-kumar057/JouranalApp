package com.shivam.Journal.App.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/Health-check")
    public String HealthCheck(){
        return "ok";
    }
}
