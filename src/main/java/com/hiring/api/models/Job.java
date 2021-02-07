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
public class Job extends Auditable {

    @Column(length = 128, nullable = false)
    private String title;

    @ManyToOne(cascade = CascadeType.ALL)
    private Recruiter recruiter;

    private Integer minExp = 0;
    private Integer maxExp = 60;
    private Boolean isActive = true;

    @ManyToOne(cascade = CascadeType.ALL)
    private City location;

    private String skills;

    @Enumerated(value = EnumType.STRING)
    private JobType jobType;

    @Column(columnDefinition="TEXT")
    private String description;

    @OneToMany(mappedBy = "job", fetch = FetchType.LAZY)
    private Set<JobApplication> jobApplications = new HashSet<>();
}
