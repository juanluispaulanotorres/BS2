package com.example.EjercicioBS2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controlador2 {
    @Autowired
    PersonaService personaServicio = new PersonaServiceImpl();

    @Autowired
    List<CiudadService> listaCiudad;

    @GetMapping("/controlador2/getPersona")
    public String personaDatos() {

        personaServicio.getNombre();
        personaServicio.getPoblacion();
        personaServicio.setEdad(personaServicio.getEdad() * 2);

        return personaServicio.toString();

    }

    @GetMapping("/controlador2/getCiudad")
    public String getCiudad() {
        return listaCiudad.toString();
    }
}