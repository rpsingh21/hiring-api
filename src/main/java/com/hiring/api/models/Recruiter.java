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
public class Recruiter extends Auditable {

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @Column(length = 64)
    private String name;

    @Column(unique = true, nullable = false, length = 64)
    private String email;
    private String password;
    private String profileImage;

    @Column(length = 32)
    private String designation;

    @ManyToOne(cascade = CascadeType.ALL)
    private Company company;

    @OneToMany(mappedBy = "recruiter", fetch = FetchType.LAZY)
    private Set<Job> jobs = new HashSet<>();
}
