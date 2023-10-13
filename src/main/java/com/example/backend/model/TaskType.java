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
public class TaskType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_type_id", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Nationalized
    @Column(name = "task_name", length = 100)
    private String taskName;

    @OneToMany(mappedBy = "taskType")
    private Set<Task> tasks = new LinkedHashSet<>();

}
