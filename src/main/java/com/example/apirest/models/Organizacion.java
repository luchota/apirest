package com.example.apirest.models;

import java.sql.Date;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.print.attribute.standard.DateTimeAtCompleted;

@Entity
public class Organizacion {
    private @Id @GeneratedValue @Column(name = "id") Long id;
    private String name;
    private int cuit;
    private String addres;
    private int phone;
    private String email;
    private Date fechaAlta;
    private String code;
    @OneToMany @JoinColumn(name = "id_Recurrentes") private List<Recurrentes> recurrentes;
    @OneToMany @JoinColumn(name = "id_No_recurrentes") private List<Norecurrentes> norecurrentes;
    

}
