package com.woniuxy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NginxController {
    @Value("${server.port}")
    private String port;


    @GetMapping("test")
    public String test(){
        return port;
    }
}
