package com.proyectox.demo.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectox.demo.entidades.Persona;
import com.proyectox.demo.repositorio.Repo_persona;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/persona")
public class PersonaController {

    @Autowired
    private Repo_persona repo;

    @GetMapping
    public String getMethodName() {
        List<Persona> personas = new ArrayList<>();
        repo.findAll().forEach(personas::add);
        return personas.toString();
    }
    
}
