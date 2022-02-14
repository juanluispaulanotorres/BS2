package com.example.EjercicioBS2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador1 {

    @Autowired(required = false)
    PersonaService personaServicio = new PersonaServiceImpl();

    @GetMapping("/controlador1/addPersona")
    public String datosPersona(@RequestHeader(defaultValue = "Juan Luis") String nombre, @RequestHeader(defaultValue = "Jaén") String poblacion, @RequestHeader(defaultValue = "26") int edad) {

        personaServicio.setNombre(nombre);
        personaServicio.setPoblacion(poblacion);
        personaServicio.setEdad(edad);

        return personaServicio.toString();

    }
}