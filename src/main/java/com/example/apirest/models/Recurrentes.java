package com.example.apirest.models;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Recurrentes {
    private @Id @GeneratedValue @Column(name= "id_Recurrentes") Long id;
    private LocalDateTime date;
     
    
}
