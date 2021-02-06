package com.hiring.api.repositories;

import com.hiring.api.models.Institute;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InstituteRepository extends JpaRepository<Institute, UUID> {
}
