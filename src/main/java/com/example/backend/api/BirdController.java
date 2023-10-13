package com.example.backend.api;

import com.example.backend.dtos.BirdDTO;
import com.example.backend.model.Bird;
import com.example.backend.service.BirdService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(value = "*", allowedHeaders = "*")
@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class BirdController {
    @Autowired
    private final BirdService birdService;
    
    @GetMapping("/cage/birds")
    public ResponseEntity<List<BirdDTO>> getAllBirds()
    {
        List<BirdDTO> list = birdService.getAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/birds/{birdId}")
    public ResponseEntity<BirdDTO> getBirdByBirdID(@PathVariable(value = "birdId") final String id)
    {
        BirdDTO bird = birdService.getBirdDTOById(id);
        return ResponseEntity.ok(bird);
    }

    @PostMapping("/birds")
    public ResponseEntity<BirdDTO> createBird(@RequestBody Bird bird )
    {
        BirdDTO birdDTO = birdService.saveBird(bird);
        return ResponseEntity.ok(birdDTO);
    }
}
