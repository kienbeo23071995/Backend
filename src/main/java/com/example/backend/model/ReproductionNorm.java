package com.example.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ReproductionNorm {
    @Id
    @Column(name = "reproduction_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "old_id")
    private Old old;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bird_type_id")
    private BirdType birdType;

}
