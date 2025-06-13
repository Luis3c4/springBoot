package com.proyectox.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class RestControllerEjemplo {
    @GetMapping(path = "/info")
    public Map<String, Object> getApi(){
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("titulo", "Aprendiendo Spring Boot");
        respuesta.put("Servidor","infoConfig");
        respuesta.put("ip", "192.168.1.1");
        return respuesta;
    }
}
