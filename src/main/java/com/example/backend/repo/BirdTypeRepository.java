package com.example.backend.repo;

import com.example.backend.model.BirdType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BirdTypeRepository extends JpaRepository<BirdType, Integer> {
}
