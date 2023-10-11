package com.facu.LucasAPITp;

import com.facu.LucasAPITp.entities.Libro;
import com.facu.LucasAPITp.repositories.LocalidadRepository;
import com.facu.LucasAPITp.repositories.PersonaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LucasAPITp {

	public static void main(String[] args) {
		SpringApplication.run(LucasAPITp.class, args);
		System.out.println("Nashe");
	}

	@Bean
	CommandLineRunner init(PersonaRepository personaRepository, LocalidadRepository localidadRepository) {
		return args -> {
			System.out.println("-----------------ESTOY FUNCIONANDO----------------");


		};
	}

}
