package com.hiring.api.repositories;

import com.hiring.api.models.Degree;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DegreeRepository extends JpaRepository<Degree, UUID> {
}
