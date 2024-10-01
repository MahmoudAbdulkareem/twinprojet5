package com.example.springbootprojet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.nio.MappedByteBuffer;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Skier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numSkier;

    private String firstName;
    private String lastName;

    @DateTimeFormat
    private Date dateOfBirth;

    private String city ;

    @OneToMany(mappedBy = "skier")
    Set<Registration> registrations;
    @ManyToMany
    Set<Skier> skier;
}

