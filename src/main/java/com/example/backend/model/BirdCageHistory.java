package com.example.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class BirdCageHistory {
    @Id
    @Column(name = "\"bird_cage_histor_id]\"", nullable = false)
    private Integer id;

    @Column(name = "\"date\"")
    private LocalDate date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cage_id")
    private Cage cage;

}
