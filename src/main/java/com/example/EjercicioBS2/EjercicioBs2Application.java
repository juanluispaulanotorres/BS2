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

		// Datos de ejemplo (comprobación de que la lista se ha creado)
		ciudad.setNombre("Jaén");
		ciudad.setNumHabitantes(5000);

		listaCiudad.add(ciudad);

		System.out.println("lista creada");
		return listaCiudad;
	}

	@Bean(name = "bean1")
	public PersonaService persona1() {

		PersonaService p1 = new PersonaServiceImpl();

		p1.setNombre("Juan Luis");
		p1.setPoblacion("Jaén");
		p1.setEdad(26);

		return p1;
	}

	@Bean(name = "bean2")
	public PersonaService persona2() {
		PersonaService p2 = new PersonaServiceImpl();

		p2.setNombre("Elena");
		p2.setPoblacion("Granada");
		p2.setEdad(28);

		return p2;
	}

	@Bean(name = "bean3")
	public PersonaService persona3() {
		PersonaService p3 = new PersonaServiceImpl();

		p3.setNombre("Carlos");
		p3.setPoblacion("Alicante");
		p3.setEdad(30);

		return p3;
	}
}