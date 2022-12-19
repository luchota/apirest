package com.example.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apirest.models.Turnos;

public interface TurnosRepo extends JpaRepository<Turnos, Long> {
    
}
