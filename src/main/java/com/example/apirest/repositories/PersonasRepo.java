package com.example.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apirest.models.Personas;

public interface PersonasRepo extends JpaRepository<Personas, Long>{
    
}
