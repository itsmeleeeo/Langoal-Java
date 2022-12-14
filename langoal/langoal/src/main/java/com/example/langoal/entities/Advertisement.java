package com.example.langoal.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter

public class Advertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date datePosted;
    private String companyName;
    private String companyEmail;
    private Date datePaid;
    private float amountPaid;
}
