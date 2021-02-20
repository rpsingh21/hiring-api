package com.hiring.api.controllers;

import com.hiring.api.models.Account;
import com.hiring.api.models.Role;
import com.hiring.api.repositories.AccountRepository;
import com.hiring.api.repositories.RoleRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class DemoController {

    private final RoleRepository roleRepository;
    private final AccountRepository accountRepository;
    private final PasswordEncoder passwordEncoder;

    public DemoController(
            RoleRepository roleRepository,
            AccountRepository accountRepository,
            PasswordEncoder passwordEncoder) {
        this.roleRepository = roleRepository;
        this.accountRepository = accountRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("")
    public String hello() {
        return "<a href='/api/admin/'> Admin API </a>";
    }

    @GetMapping("db-init")
    public String dbInit() {
        accountRepository.deleteAll();
        roleRepository.deleteAll();
        Role superuser = Role.builder().name("SUPER_USER").description("").build();
        Role job_seeker = Role.builder().name("JOB_SEEKER").description("").build();
        Role recruiter = Role.builder().name("RECRUITER").description("").build();
        roleRepository.save(superuser);
        roleRepository.save(job_seeker);
        roleRepository.save(recruiter);
        Account s_account = Account.builder()
                .name("Rohit Singh")
                .email("rpsingh@gmail.com")
                .username("rpsingh")
                .password(passwordEncoder.encode("rohit@12"))
                .role(superuser)
                .build();
        accountRepository.save(s_account);
        return "success";
    }
}
