package com.rabindra.social.media.login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String homePage(){
        return "WELCOME TO THE HOME SCREEN.";
    }

    @GetMapping("/secured")
    public String securedPage(){
        return "WELCOME TO THE SECURED Page.";
    }
}
