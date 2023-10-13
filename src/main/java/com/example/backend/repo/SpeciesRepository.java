package com.example.backend.repo;

import com.example.backend.model.Species;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeciesRepository extends JpaRepository<Species, Integer> {
}
