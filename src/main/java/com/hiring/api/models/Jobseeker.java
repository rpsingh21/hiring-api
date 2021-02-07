package com.hiring.api.models;

import lombok.*;

import javax.persistence.*;
import java.util.*;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(indexes = {})
public class Jobseeker extends Auditable {

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @Column(unique = true, nullable = false, length = 64)
    private String email;
    private Boolean isEmailVerified = false;
    private String image;
    private String resume;

    @Column(unique = true, length = 12)
    private String phone;
    private Boolean isPhoneVerified = false;

    @Column(length = 64)
    private String name;

    @Column(length = 128)
    private String headLine;

    @ManyToOne(cascade = CascadeType.ALL)
    private City city;

    @Temporal(TemporalType.DATE)
    private Date dob;

    @Column(length = 16)
    @Enumerated(value = EnumType.STRING)
    private Gender gender;
    private Integer currentCTC = 0;
    private Integer expectedCTC = 0;

    @Column(length = 516)
    private String skills;

    @OneToMany(mappedBy = "jobseeker", fetch = FetchType.EAGER)
    private Set<Experience> experiences = new HashSet<>();

    @OneToMany(mappedBy = "jobseeker", fetch = FetchType.EAGER)
    private Set<Education> educations = new HashSet<>();

    @OneToMany(mappedBy = "candidate", fetch = FetchType.LAZY)
    private Set<JobApplication> jobApplications = new HashSet<>();

}
