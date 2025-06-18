package com.proyectox.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectox.demo.models.Empleados;
import com.proyectox.demo.models.dto.ClaseDTO;


@RestController
@RequestMapping("/api")
public class RestControllerEjemplo {
    @GetMapping(path = "/info")
    public ClaseDTO getApi(){
        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("administrador");
        usuario1.setUsuario("informatico");
        // Empleados empleado1= new Empleados("Juan", "Rodrigez", "calle 1", "Getente", 35,123456789, 1);
        // Map<String, Object> respuesta = new HashMap<>();
        // respuesta.put("Empleado", empleado1);
        return usuario1;
    }
}
