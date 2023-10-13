package com.example.backend.repo;

import com.example.backend.dtos.BirdDTO;
import com.example.backend.model.Bird;

import java.util.List;

public interface BirdRepositoryCustom {
    public List<BirdDTO> getAll();

    public BirdDTO getBirdDTOByID(String id);
}
