package com.example.backend.repo;

import com.example.backend.model.TaskType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskTypeRepository extends JpaRepository<TaskType, Integer> {
}
