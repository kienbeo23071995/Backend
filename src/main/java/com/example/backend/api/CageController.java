package com.example.backend.api;

import com.example.backend.model.Cage;
import com.example.backend.service.CageService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(value = "*", allowedHeaders = "*")
@RestController
@AllArgsConstructor
@RequestMapping("/api/cage")
public class CageController {
    @Autowired
    private CageService cageService;

    @GetMapping("/cards")
    public ResponseEntity<List<Cage>> getAll(){
        return ResponseEntity.ok(cageService.getAll());
    }
}
