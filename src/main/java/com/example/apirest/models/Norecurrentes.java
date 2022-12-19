package com.example.apirest.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Norecurrentes {
    private @Id @GeneratedValue @Column(name  = "id_No_recurrente")Long id;
    private String code;
    private String name;
    private Date date;
    private Boolean active;
}
