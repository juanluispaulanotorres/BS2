package com.example.EjercicioBS2;

/*@Service*/
public class CiudadServiceImpl implements CiudadService{

    Ciudad ciudad = new Ciudad();

    public CiudadServiceImpl() {
        this.ciudad = ciudad;
    }

    @Override
    public String getNombre() {
        return ciudad.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        ciudad.setNombre(nombre);
    }

    @Override
    public int getNumHabitantes() {
        return ciudad.getNumeroHabitantes();
    }

    @Override
    public void setNumHabitantes(int numHab) {
        ciudad.setNumeroHabitantes(numHab);
    }

    @Override
    public String toString() {
        return "CiudadServiceImpl{" +
                "ciudad=" + ciudad +
                '}';
    }
}
