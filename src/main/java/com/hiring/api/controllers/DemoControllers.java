package com.hiring.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class DemoControllers {

    @GetMapping("")
    public String home(){
        return "Hello Spring => <a href='/api/admin/'> Admin REST API </a>";
    }
}
