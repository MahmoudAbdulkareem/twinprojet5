package entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Skier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numSkier;

    private String firstName;
    private String lastName;

    @DateTimeFormat
    private Date dateOfBirth;

    private String city ;
}

