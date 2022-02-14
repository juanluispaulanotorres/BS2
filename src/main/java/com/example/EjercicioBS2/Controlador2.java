package com.example.EjercicioBS2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador2 {
    @Autowired
    PersonaService personaServicio = new PersonaServiceImpl();

    @GetMapping("/controlador2/getPersona")
    public String personaDatos() {

        personaServicio.getNombre();
        personaServicio.getPoblacion();
        personaServicio.setEdad(personaServicio.getEdad() * 2);

        return personaServicio.toString();

    }
}