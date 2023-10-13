package com.example.backend.repo;

import com.example.backend.model.FeedSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedScheduleRepository extends JpaRepository<FeedSchedule, String> {
}
