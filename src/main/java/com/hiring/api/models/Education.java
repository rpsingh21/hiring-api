package com.hiring.api.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(indexes = {})
public class Education extends Auditable {

    @ManyToOne(cascade = CascadeType.ALL)
    private Jobseeker jobseeker;

    @ManyToOne(cascade = CascadeType.DETACH)
    private Degree degree;

    @ManyToOne(cascade = CascadeType.ALL)
    private Institute institute;

    @Temporal(TemporalType.DATE)
    private Date batchFrom;

    @Temporal(TemporalType.DATE)
    private Date batchTo;
    private String specialization;

    @Enumerated(value = EnumType.STRING)
    private CourseType courseType;

    private String description;
}
