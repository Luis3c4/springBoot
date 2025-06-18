package com.proyectox.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.proyectox.demo.entidades.Persona;
import com.proyectox.demo.repositorio.Repo_persona;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	//Inyéctame automáticamente una instancia de esta clase o interfaz
	@Autowired
	private Repo_persona repo;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Persona> personas = new ArrayList<>();
		repo.findAll().forEach(personas::add);
	}

}
