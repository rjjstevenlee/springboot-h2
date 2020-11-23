package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @RequestMapping("/list")
    public String getGoodsList(){
        return "goods";
    }
    @RequestMapping("/detail")
    public String getGoodsDetail(){
        return "goods";
    }
}
