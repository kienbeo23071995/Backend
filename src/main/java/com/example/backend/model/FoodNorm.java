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
public class FoodNorm {
    @Id
    @Column(name = "food_norm_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "care_id")
    private CareMode care;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bird_type_id")
    private BirdType birdType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "old_id")
    private Old old;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_beveage_id")
    private FoodBeverage foodBeveage;

}
