package com.example.backend.repo;

import com.example.backend.model.FoodType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodTypeRepository extends JpaRepository<FoodType, Integer> {
}
