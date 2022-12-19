package com.example.apirest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Turnos {
    private @Id @GeneratedValue @Column(name = "id_TURNOS") Long  id;
    @OneToOne private Recurrentes recurrente;
    @OneToOne private Norecurrentes norecurrentes;



    
}
