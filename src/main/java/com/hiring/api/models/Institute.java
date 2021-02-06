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
public class Institute extends Auditable {

    @Column(unique = true, nullable = false)
    private String name;

    @ManyToOne(cascade = CascadeType.DETACH)
    private City city;
}
