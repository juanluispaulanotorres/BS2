package com.example.EjercicioBS2;

import org.springframework.beans.factory.annotation.Autowired;

public interface PersonaService {
    String getNombre();
    void setNombre(String nombre);
    String getPoblacion();
    void setPoblacion(String poblacion);
    int getEdad();
    void setEdad(int edad);
    String toString();
}
