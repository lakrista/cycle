package com.lakrista.cycle.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Item extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private boolean active;
}
