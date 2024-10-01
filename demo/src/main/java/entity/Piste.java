package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Piste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numPiste;

    private String namePiste;
    @Enumerated(EnumType.STRING)
    private Color color;

    private int length;
    private int slop ;

}
