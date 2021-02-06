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
public class Experience extends Auditable {

    @ManyToOne(cascade = CascadeType.ALL)
    private Jobseeker jobseeker;

    @ManyToOne(cascade = CascadeType.ALL)
    private Company company;

    @Temporal(TemporalType.DATE)
    private Date durationFrom;

    @Temporal(TemporalType.DATE)
    private Date durationTo;

    private Boolean isPresent = false;
    private String description;
}
