package com.hiring.api.repositories;

import com.hiring.api.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {
    Optional<Account> findFirstByUsername(String username);
}
