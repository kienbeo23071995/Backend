package com.example.backend.repo;

import com.example.backend.model.CageType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CageTypeRepository extends JpaRepository<CageType, Integer> {
}
