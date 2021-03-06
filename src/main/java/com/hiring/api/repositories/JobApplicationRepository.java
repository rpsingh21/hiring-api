package com.hiring.api.repositories;

import com.hiring.api.models.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JobApplicationRepository extends JpaRepository<JobApplication, UUID> {
}
