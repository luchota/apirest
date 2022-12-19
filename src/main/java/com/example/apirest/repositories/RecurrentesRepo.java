package com.example.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apirest.models.Recurrentes;

public interface RecurrentesRepo extends JpaRepository<Recurrentes, Long> {
    
}
