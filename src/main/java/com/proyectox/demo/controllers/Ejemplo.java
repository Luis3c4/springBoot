package com.proyectox.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.proyectox.demo.models.Empleados;


@Controller
public class Ejemplo {
    @GetMapping("/info")
    public String info(Model model) {
        Empleados empleado1 = new Empleados("juan", "perez", "calle2", "gerente", 25, 1234567899, 3);
        model.addAttribute("titulo", "Info de Persona");
        model.addAttribute("EmpleadoModel", empleado1);
        return "info";
    }
    @ModelAttribute("Empleados")
    public List<Empleados> ListaEmpleados(){
        return Arrays.asList(
            new Empleados("Maria", "coello", "calle3", "gerente", 30, 9123847,3),
            new Empleados("Luis", "Choqque", "calle4", "gerente", 30, 9123847,3)
        );
    }
}
