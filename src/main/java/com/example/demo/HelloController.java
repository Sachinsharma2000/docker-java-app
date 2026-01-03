package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.env:dev}")
    private String env;

    @Value("${app.name:JavaDockerApp}")
    private String appName;

    @GetMapping("/")
    public String home() {
        return "Hello from " + appName + " running in " + env + " environment";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
