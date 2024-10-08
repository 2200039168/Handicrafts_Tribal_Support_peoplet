package com.tribal.handicrafts.model;

import javax.persistence.*;

@Entity
public class Artisan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private String contactInfo;
    // Getters and Setters
}
