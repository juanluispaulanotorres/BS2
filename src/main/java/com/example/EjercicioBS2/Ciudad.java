package com.example.EjercicioBS2;

import lombok.Data;

@Data
public class Ciudad {
    private String nombre;
    private int numeroHabitantes;

    public Ciudad() {

    }

    public Ciudad(String nombre, int numHab) {
        this.nombre = nombre;
        this.numeroHabitantes = numHab;
    }
}
