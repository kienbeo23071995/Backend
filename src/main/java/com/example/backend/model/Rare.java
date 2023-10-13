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
public class Rare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rare_id", nullable = false)
    private Integer id;

    @Size(max = 100)
    @NotNull
    @Nationalized
    @Column(name = "race", nullable = false, length = 100)
    private String race;

    @OneToMany(mappedBy = "rare")
    private Set<BirdType> birdTypes = new LinkedHashSet<>();

}
