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
public class CareMode {
    @Id
    @Column(name = "care_id", nullable = false)
    private Integer id;

    @Column(name = "Food_norm_id")
    private Integer foodNormId;

    @OneToMany(mappedBy = "care")
    private Set<FoodNorm> foodNorms = new LinkedHashSet<>();

}
