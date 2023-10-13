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
public class BirdFoodQuantityDefault {
    @EmbeddedId
    private BirdFoodQuantityDefaultId id;

    @MapsId("speciesId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "species_id", nullable = false)
    private Species species;

    @MapsId("birdTypeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "bird_type_id", nullable = false)
    private BirdType birdType;

    @Column(name = "quantity")
    private Integer quantity;

}
