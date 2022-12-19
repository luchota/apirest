package com.example.apirest.models;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



@Entity
public class Personas {
    private @Id @GeneratedValue Long id;
    private String name;
    private int dni;
    private String lastname;
    @OneToMany @JoinColumn(name = "id_TURNOS") private List<Turnos> turnos;
    public Personas(){}    
    public Personas(Long id, String name, String lastname, int dni){
        this.name=name;
        this.id=id;
        this.lastname=lastname;
        this.dni=dni;
        this.turnos=new ArrayList<>();
    }
}
