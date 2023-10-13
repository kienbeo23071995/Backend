package com.example.backend.repo;

import com.example.backend.model.BirdCageHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BirdCageHistoryRepository extends JpaRepository<BirdCageHistory, Integer> {
}
