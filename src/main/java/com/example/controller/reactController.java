package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class reactController {

    @GetMapping("/main")
    public String reactMain() {
        return "/main/main";
    }
}
