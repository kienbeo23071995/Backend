package com.example.backend.repo;

import com.example.backend.model.CareMode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CareModeRepository extends JpaRepository<CareMode, Integer> {
}
