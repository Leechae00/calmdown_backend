package com.example.calmdown.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {

    @GetMapping("/test")
    public String test(){
        return "success";
    }
}
