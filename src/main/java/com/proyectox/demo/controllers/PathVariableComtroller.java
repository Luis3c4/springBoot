package com.proyectox.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectox.demo.models.Empleados;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/variable")


public class PathVariableComtroller {
    @Value("${config.usuario}")
    private String usuario;

    @GetMapping("/pagina1/{mensaje}")
    public ParametroDTO pag1(@PathVariable String mensaje) {
        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInformacion(mensaje);
        return parametro1;
    }
    @PostMapping("/solicitud")
    public Empleados creaEmple(@RequestBody Empleados empleado1) {
        return empleado1;
    }

    @GetMapping("/valores")
    public Map<String, Object> values() {
        Map<String, Object> json = new HashMap<>();
        json.put("Usuario", usuario);
        return json;
    }
    
    
    
}
