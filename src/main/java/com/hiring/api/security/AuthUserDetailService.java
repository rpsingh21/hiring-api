package com.hiring.api.security;

import com.hiring.api.models.Account;
import com.hiring.api.repositories.AccountRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthUserDetailService implements UserDetailsService {

    private final AccountRepository accountRepository;

    public AuthUserDetailService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Account> account= accountRepository.findFirstByUsername(username);
        if(account.isEmpty()){
            throw new UsernameNotFoundException("No such username "+ username);
        }
        return new AuthUserDetail(account.get());
    }
}
