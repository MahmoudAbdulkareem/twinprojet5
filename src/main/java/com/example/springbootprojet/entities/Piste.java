package com.example.springbootprojet.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int numPiste;
    private String namePiste;
    private Color color;
    private int length;
    private int slope;
@OneToMany(mappedBy = "skiers")
    Set<Skier> skier;
@ManyToMany(mappedBy = "skiers")
    Set<>
}
