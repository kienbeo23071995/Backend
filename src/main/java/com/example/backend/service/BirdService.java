package com.example.backend.service;

import com.example.backend.dtos.BirdDTO;
import com.example.backend.model.Bird;

import java.util.List;

public interface BirdService {
    public List<BirdDTO> getAll();

    BirdDTO getBirdDTOById(String id);

    BirdDTO saveBird(Bird bird);
}
