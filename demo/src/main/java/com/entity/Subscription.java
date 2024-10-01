package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Subscription {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numSub;

    private Date startDate;

    private Date endDate ;

    private Float price;
    @Enumerated(EnumType.STRING)
    private TypeSubscription typeSubscription;
}
