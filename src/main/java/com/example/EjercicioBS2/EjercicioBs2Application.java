package com.example.EjercicioBS2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class EjercicioBs2Application {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioBs2Application.class, args);
	}

	@Bean
	public List<CiudadService> crearlista() {

		List<CiudadService> listaCiudad = new ArrayList();
		CiudadService ciudad = new CiudadServiceImpl();

		ciudad.setNombre("Jaén");
		ciudad.setNumHabitantes(5000);

		listaCiudad.add(ciudad);

		System.out.println("lista creada");
		return listaCiudad;
	}
}