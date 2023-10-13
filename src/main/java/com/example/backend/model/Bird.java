package com.example.backend.model;

import com.example.backend.dtos.BirdDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@SqlResultSetMappings(
        {
                @SqlResultSetMapping(
                        name = "BirdDTO",
                        classes = {
                                @ConstructorResult(
                                        targetClass = BirdDTO.class,
                                        columns = {
                                                @ColumnResult(name = "bird_id", type = String.class),
                                                @ColumnResult(name = "bird_name", type = String.class),
                                                @ColumnResult(name = "bird_age", type = Integer.class),
                                                @ColumnResult(name = "status", type = String.class),
                                                @ColumnResult(name = "species_name", type = String.class),
                                                @ColumnResult(name = "cageId", type = String.class),
                                                @ColumnResult(name = "food_quantity", type = Integer.class),
                                                @ColumnResult(name = "periodId", type = String.class),
                                                @ColumnResult(name = "birdGender", type = Boolean.class),
                                                @ColumnResult(name = "hatchingDate", type = LocalDate.class),
                                                @ColumnResult(name = "bird_image", type = String.class)
                                        }
                                ),
                        }
                )
        }
)
public class Bird {
    @Id
    @Size(max = 100)
    @Column(name = "bird_id", nullable = false, length = 100)
    private String birdId;

    @Size(max = 100)
    @NotNull
    @Nationalized
    @Column(name = "bird_name", nullable = false, length = 100)
    private String birdName;

    @Column(name = "bird_age")
    private LocalDate birdAge;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "status_id", nullable = false)
    private Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bird_type_id")
    private BirdType birdType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "species_id")
    private Species species;

    @Column(name = "food_quantity")
    private Integer foodQuantity;

    @OneToMany(mappedBy = "bird")
    private Set<Cage> cages = new LinkedHashSet<>();

    @Column(name = "birdGender")
    private Boolean birdGender;

    @Column(name = "hatchingDate")
    private LocalDate hatchingDate;

    @Column(name = "bird_image")
    private String birdImage;
}
