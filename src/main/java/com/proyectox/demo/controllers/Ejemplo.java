package com.proyectox.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Ejemplo {
    @GetMapping("/info")
    public String info(Model model) {
        model.addAttribute("titulo", "Aprendiendo Spring Boot");
        return "info";
    }
}
