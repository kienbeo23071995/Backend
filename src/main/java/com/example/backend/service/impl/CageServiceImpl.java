package com.example.backend.service.impl;

import com.example.backend.model.Cage;
import com.example.backend.repo.CageRepository;
import com.example.backend.service.CageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CageServiceImpl implements CageService {
    @Autowired
    private final CageRepository cageRepository;

    public CageServiceImpl(CageRepository cageRepository) {
        this.cageRepository = cageRepository;
    }

    @Override
    public List<Cage> getAll() {
        return cageRepository.findAll();
    }
}
