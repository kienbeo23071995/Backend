package com.example.backend.repo;

import com.example.backend.model.Rare;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RareRepository extends JpaRepository<Rare, Integer> {
}
