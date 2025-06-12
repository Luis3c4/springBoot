package com.proyectox.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestControllerEjemplo {
    @GetMapping("/api")
    public String getApi(){
        return "hola";
    }
}
