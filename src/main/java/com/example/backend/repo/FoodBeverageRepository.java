package com.example.backend.repo;

import com.example.backend.model.FoodBeverage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodBeverageRepository extends JpaRepository<FoodBeverage, Integer> {
}
