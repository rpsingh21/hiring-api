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
public class Account extends Auditable {
    @Column(unique = true, nullable = false, length = 32)
    private String username;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @Singular
    private Set<Role> roles = new HashSet<>();

    @OneToOne(mappedBy = "account")
    private Jobseeker jobseeker;

    @OneToOne(mappedBy = "account")
    private Recruiter recruiter;
}
