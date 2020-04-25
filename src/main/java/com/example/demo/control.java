package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control {

    @RequestMapping("/next")
    public String next(){
        return "next";
    }
}
