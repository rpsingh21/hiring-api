package com.hiring.api.repositories;

import com.hiring.api.models.Recruiter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RecruiterRepository extends JpaRepository<Recruiter, UUID> {
}
