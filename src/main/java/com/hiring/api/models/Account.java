package com.hiring.api.models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @Column(unique = true, nullable = false, length = 64)
    private String email;

    @Column(length = 64)
    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @Singular
    private List<Role> roles = new ArrayList<>();

    @OneToOne(mappedBy = "account")
    private Jobseeker jobseeker;

    @OneToOne(mappedBy = "account")
    private Recruiter recruiter;
}
