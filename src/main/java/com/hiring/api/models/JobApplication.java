package com.hiring.api.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(indexes = {})
public class JobApplication extends Auditable {

    @ManyToOne(cascade = CascadeType.ALL)
    private Job job;

    @ManyToOne(cascade = CascadeType.ALL)
    private Jobseeker candidate;

    @Enumerated(EnumType.STRING)
    private ApplicationStatus applicationStatus;
}
