package com.educacionIT.digitalers.Clase06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.educacionIT.digitalers.Entidades.Persona;

public class AppMap {

	public static void main(String[] args) {
		List<String> nombres = Arrays.asList("Fede","Octavio","Lautaro","Daniela","Hector","Mariana");
		
		nombres = nombres.stream().map(String :: toUpperCase).collect(Collectors.toList());
		
		List<Persona> personas = Arrays.asList(
				new Persona("Federico", "01", (byte) 19),
				new Persona("Octavio", "05", (byte) 15),
				new Persona("octavio", "02", (byte) 15),
				new Persona("Roberto", "03", (byte) 30),
				new Persona("Axel", "06", (byte) 30),
				new Persona("Ricardo", "04", (byte) 20)
				);
		
		
		personas = personas.stream().map(e -> new Persona(
													e.getDescripcion().toUpperCase(),
													e.getDocumento(),
													e.getEdad())
										).collect(Collectors.toList());
		
		
		personas.forEach(System.out :: println);
	}

}
