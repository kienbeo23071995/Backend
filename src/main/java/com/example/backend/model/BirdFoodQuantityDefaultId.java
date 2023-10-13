package com.example.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class BirdFoodQuantityDefaultId implements Serializable {
    private static final long serialVersionUID = 4419302153426386629L;
    @NotNull
    @Column(name = "species_id", nullable = false)
    private Integer speciesId;

    @NotNull
    @Column(name = "bird_type_id", nullable = false)
    private Integer birdTypeId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BirdFoodQuantityDefaultId entity = (BirdFoodQuantityDefaultId) o;
        return Objects.equals(this.birdTypeId, entity.birdTypeId) &&
                Objects.equals(this.speciesId, entity.speciesId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(birdTypeId, speciesId);
    }

}
