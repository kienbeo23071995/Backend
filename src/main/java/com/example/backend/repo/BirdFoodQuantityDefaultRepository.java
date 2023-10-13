package com.example.backend.repo;

import com.example.backend.model.BirdFoodQuantityDefault;
import com.example.backend.model.BirdFoodQuantityDefaultId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BirdFoodQuantityDefaultRepository extends JpaRepository<BirdFoodQuantityDefault, BirdFoodQuantityDefaultId> {
}
