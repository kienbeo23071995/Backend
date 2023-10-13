package com.example.backend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class BirdType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bird_type_id", nullable = false)
    private Integer id;

    @Size(max = 100)
    @NotNull
    @Nationalized
    @Column(name = "bird_type", nullable = false, length = 100)
    private String birdType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rare_id")
    private Rare rare;

    @OneToMany(mappedBy = "birdType")
    private Set<Bird> birds = new LinkedHashSet<>();

    @OneToMany(mappedBy = "birdType")
    private Set<BirdFoodQuantityDefault> birdFoodQuantityDefaults = new LinkedHashSet<>();

    @OneToMany(mappedBy = "birdType")
    private Set<FoodNorm> foodNorms = new LinkedHashSet<>();

    @OneToMany(mappedBy = "birdType")
    private Set<ReproductionNorm> reproductionNorms = new LinkedHashSet<>();

    @OneToMany(mappedBy = "birdType")
    private Set<Species> species = new LinkedHashSet<>();

}
