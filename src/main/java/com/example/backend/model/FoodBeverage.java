package com.example.backend.model;

import jakarta.persistence.*;
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
@Table(name = "\"Food&Beverage\"")
public class FoodBeverage {
    @Id
    @Column(name = "food_beveage_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "old_id")
    private Old old;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "schedule_id")
    private FeedSchedule schedule;

    @Column(name = "food_type_id")
    private Integer foodTypeId;

    @OneToMany(mappedBy = "foodBeveage")
    private Set<FoodNorm> foodNorms = new LinkedHashSet<>();

}
