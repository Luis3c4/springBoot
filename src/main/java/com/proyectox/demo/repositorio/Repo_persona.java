package com.proyectox.demo.repositorio;


import com.proyectox.demo.entidades.Persona;
import org.springframework.data.repository.CrudRepository;

public interface Repo_persona extends CrudRepository<Persona, Long> {
    
}
