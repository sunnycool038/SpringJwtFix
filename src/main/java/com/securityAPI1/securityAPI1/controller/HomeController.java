package com.securityAPI1.securityAPI1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getDetails(){
        return "details not available";
    }
}
