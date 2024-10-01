package com.example.springbootprojet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numInstructor;

    private String firstName;
    private String lastName;
    LocalDate dateOfHire;

    @OneToMany
    Set<Course> courses;
}
