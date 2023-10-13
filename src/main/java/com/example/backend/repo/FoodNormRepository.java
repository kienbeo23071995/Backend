package com.example.backend.repo;

import com.example.backend.model.FoodNorm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodNormRepository extends JpaRepository<FoodNorm, Integer> {
}
