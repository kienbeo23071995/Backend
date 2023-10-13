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
public class Account {
    @Id
    @Size(max = 100)
    @Column(name = "account_id", nullable = false, length = 100)
    private String accountId;

    @Size(max = 100)
    @NotNull
    @Nationalized
    @Column(name = "account_name", nullable = false, length = 100)
    private String accountName;

    @Lob
    @Column(name = "hash_password")
    private String hashPassword;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private Role role;

    @OneToMany(mappedBy = "account")
    private Set<Task> tasks = new LinkedHashSet<>();

}
