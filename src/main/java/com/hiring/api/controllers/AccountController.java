package com.hiring.api.controllers;

import com.hiring.api.models.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    private PasswordEncoder passwordEncoder;

    @PostMapping("")
    public Account create(@RequestBody Account account) {
        String password = account.getPassword();
        account.setUsername(account.getEmail().split("@")[0]);
        account.setPassword(passwordEncoder.encode(password));
        return account;
    }
}
