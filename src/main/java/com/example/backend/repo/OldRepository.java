package com.example.backend.repo;

import com.example.backend.model.Old;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OldRepository extends JpaRepository<Old, Integer> {
}
