package com.example.backend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class FeedSchedule {
    @Id
    @Size(max = 100)
    @Column(name = "schedule_id", nullable = false, length = 100)
    private String scheduleId;

    @Column(name = "feed_date")
    private Instant feedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cage_id")
    private Cage cage;

    @OneToMany(mappedBy = "schedule")
    private Set<FoodBeverage> foodBeverages = new LinkedHashSet<>();

}
