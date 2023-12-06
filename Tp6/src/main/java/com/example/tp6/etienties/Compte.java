package com.example.tp6.etienties;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data

@AllArgsConstructor
@NoArgsConstructor
@Table
public class Compte {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private double solde;
    @Column
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column
    @Enumerated(EnumType.ORDINAL)
    private TypeCompte type;
    @Column
    @Enumerated(EnumType.ORDINAL)
    private EtatCompte etat;


}
