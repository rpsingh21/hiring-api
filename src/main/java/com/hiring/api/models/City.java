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
public class City extends Auditable {

    @Column(length = 32)
    private String name;

    @Column(length = 32)
    private String state;

    @OneToMany(mappedBy = "city", fetch = FetchType.EAGER)
    private Set<Jobseeker> jobseekers = new HashSet<>();
}
