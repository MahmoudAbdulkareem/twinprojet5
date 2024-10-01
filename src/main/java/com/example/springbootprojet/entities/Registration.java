package com.example.springbootprojet.entities;

import jakarta.persistence.*;

@Entity
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numRegistration ;
    private int numWeek;

    @ManyToOne
    Skier skier;
}
