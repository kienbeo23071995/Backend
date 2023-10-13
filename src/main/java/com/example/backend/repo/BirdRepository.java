package com.example.backend.repo;

import com.example.backend.model.Bird;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BirdRepository extends JpaRepository<Bird, String>,BirdRepositoryCustom{
}
