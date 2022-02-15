package com.example.EjercicioBS2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class Controlador1 {

    @Autowired
    @Qualifier("bean1")
    PersonaService personaServicio = new PersonaServiceImpl();

    @Autowired
    List<CiudadService> listaCiudad;

    @GetMapping("/controlador1/addPersona")
    public String datosPersona(@RequestHeader(defaultValue = "Juan Luis") String nombre, @RequestHeader(defaultValue = "Jaén") String poblacion, @RequestHeader(defaultValue = "26") int edad) {

        personaServicio.setNombre(nombre);
        personaServicio.setPoblacion(poblacion);
        personaServicio.setEdad(edad);

        return personaServicio.toString();

    }

    @PostMapping(value = "/controlador1/addCiudad")
    public String addCiudad(@RequestBody Ciudad ciudad ) {

        CiudadService c = new CiudadServiceImpl();

        c.setNombre(ciudad.getNombre());
        c.setNumHabitantes(ciudad.getNumeroHabitantes());

        listaCiudad.add(c);

        return c.toString();
    }
}