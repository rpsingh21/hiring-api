package com.hiring.api.controllers;

import com.hiring.api.models.Account;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    @PostMapping("")
    public Account create(@RequestBody Account account) {
        return account;
    }
}
