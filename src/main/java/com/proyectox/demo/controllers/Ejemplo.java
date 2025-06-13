package com.proyectox.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Ejemplo {
    @GetMapping("/info")
    public String info(Model model) {
        model.addAttribute("titulo", "Aprendiendo Spring Boot");
        return "info";
    }
}
