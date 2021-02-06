package com.hiring.api.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(indexes = {})
public class Degree extends Auditable {

    @Column(unique = true, nullable = false)
    private String name;
    private String description;
}
