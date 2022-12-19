package com.example.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.apirest.models.Personas;
import com.example.apirest.repositories.PersonasRepo;

@SpringBootApplication
public class ApirestApplication implements CommandLineRunner{

	@Autowired PersonasRepo personasRepo;

	public static void main(String[] args) {
		SpringApplication.run(ApirestApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		Personas personas = new Personas(1L, "Luciano", "Torre", 39614789);
		personasRepo.save(personas);
		
	}
}
	

	


