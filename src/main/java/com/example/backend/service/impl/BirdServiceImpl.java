package com.example.backend.service.impl;

import com.example.backend.dtos.BirdDTO;
import com.example.backend.model.Bird;
import com.example.backend.repo.BirdRepository;
import com.example.backend.service.BirdService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class BirdServiceImpl implements BirdService {
    @Autowired
    private final BirdRepository birdRepository;
    @Override
    public List<BirdDTO> getAll() {
        return birdRepository.getAll();
    }

    @Override
    public BirdDTO getBirdDTOById(String id) {
        return birdRepository.getBirdDTOByID(id);
    }

    @Override
    public BirdDTO saveBird(Bird bird) {
        birdRepository.save(bird);
        return birdRepository.getBirdDTOByID(bird.getBirdId());
    }
}
