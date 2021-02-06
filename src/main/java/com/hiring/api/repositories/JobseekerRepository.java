package com.hiring.api.repositories;

import com.hiring.api.models.Jobseeker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JobseekerRepository extends JpaRepository<Jobseeker, UUID> {
}
