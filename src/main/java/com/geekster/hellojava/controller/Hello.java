package com.geekster.hellojava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping(value = "/hi")
    public String hello(){
        return "My Name Is Mukesh Pal";
    }
}
