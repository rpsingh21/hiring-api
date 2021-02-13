package com.hiring.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class DemoContoller {
    @GetMapping("")
    public String hello() {
        return "<a href='/api/admin/'> Admin API </a>";
    }
}
