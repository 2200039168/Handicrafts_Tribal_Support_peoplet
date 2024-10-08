package com.tribal.handicrafts.model;

import javax.persistence.*;

@Entity
public class Handicraft {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private String description;

    @ManyToOne
    @JoinColumn(name = "artisan_id", nullable = false)
    private Artisan artisan;
    // Getters and Setters
}
