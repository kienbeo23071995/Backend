package com.example.backend.repo;

import com.example.backend.model.Cage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CageRepository extends JpaRepository<Cage, String> {
}
