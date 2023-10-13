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
public class Species {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "species_id", nullable = false)
    private Integer id;

    @Size(max = 100)
    @NotNull
    @Nationalized
    @Column(name = "species_name", nullable = false, length = 100)
    private String speciesName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bird_type_id")
    private BirdType birdType;

    @OneToMany(mappedBy = "species")
    private Set<Bird> birds = new LinkedHashSet<>();

    @OneToMany(mappedBy = "species")
    private Set<BirdFoodQuantityDefault> birdFoodQuantityDefaults = new LinkedHashSet<>();

    @OneToMany(mappedBy = "species")
    private Set<Cage> cages = new LinkedHashSet<>();

}
