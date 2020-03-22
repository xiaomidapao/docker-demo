package com.example.demodocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gy
 */
@RestController
public class TestController {
    @GetMapping(value = "/hello")
    public String hello(){
        return "hello world";
    }
}
