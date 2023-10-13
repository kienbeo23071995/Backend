package com.example.backend.model;

import jakarta.persistence.*;
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
public class CageType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cage_type_id", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Nationalized
    @Column(name = "cage_type_name", length = 100)
    private String cageTypeName;

    @OneToMany(mappedBy = "cageType")
    private Set<Cage> cages = new LinkedHashSet<>();

}
