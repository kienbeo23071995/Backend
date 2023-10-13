package com.example.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
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
public class Cage {
    @Id
    @Size(max = 100)
    @Column(name = "cage_id", nullable = false, length = 100)
    private String cageId;

    @Column(name = "numberOfBird")
    private Integer numberOfBird;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bird_id")
    private Bird bird;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "species_id")
    private Species species;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cage_type_id")
    private CageType cageType;

    @OneToMany(mappedBy = "cage")
    @JsonIgnore
    private Set<BirdCageHistory> birdCageHistories = new LinkedHashSet<>();

    @OneToMany(mappedBy = "cage")
    @JsonIgnore
    private Set<FeedSchedule> feedSchedules = new LinkedHashSet<>();

    @OneToMany(mappedBy = "cage")
    @JsonIgnore
    private Set<Task> tasks = new LinkedHashSet<>();

}
