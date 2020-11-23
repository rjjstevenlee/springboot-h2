package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/list")
    public String getHello(){
        return "hello";
    }
    @RequestMapping("/list2")
    public String getHello2(){
        return "hello2";
    }
    @RequestMapping("/list3")
    public String getHello3(){
        return "hello3";
    }
}
