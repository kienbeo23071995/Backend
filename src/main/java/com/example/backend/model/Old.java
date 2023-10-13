package com.example.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Old {
    @Id
    @Column(name = "old_id", nullable = false)
    private Integer id;

    @Column(name = "food_norm_id")
    private Integer foodNormId;

    @Column(name = "reproduction_norm")
    private Integer reproductionNorm;

    @OneToMany(mappedBy = "old")
    private Set<FoodBeverage> foodBeverages = new LinkedHashSet<>();

    @OneToMany(mappedBy = "old")
    private Set<FoodNorm> foodNorms = new LinkedHashSet<>();

    @OneToMany(mappedBy = "old")
    private Set<ReproductionNorm> reproductionNorms = new LinkedHashSet<>();

}
