package com.hiring.api.models;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(indexes = {})
public class Company extends Auditable{

    @Column(unique = true, nullable = false)
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    private City city;
    private String logo;

    @OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
    private Set<Experience> experiences = new HashSet<>();

    @OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
    private Set<Recruiter> recruiters = new HashSet<>();
}
