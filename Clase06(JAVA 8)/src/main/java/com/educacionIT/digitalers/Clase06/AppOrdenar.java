package com.educacionIT.digitalers.Clase06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.educacionIT.digitalers.Entidades.Persona;

public class AppOrdenar {

	public static void main(String[] args) {
		List<Persona> personas = Arrays.asList(
				new Persona("Federico", "01", (byte) 19),
				new Persona("Octavio", "05", (byte) 15),
				new Persona("octavio", "02", (byte) 15),
				new Persona("Roberto", "03", (byte) 30),
				new Persona("Axel", "06", (byte) 30),
				new Persona("Ricardo", "04", (byte) 20)
				);
		/*
		personas.sort(
				new Comparator<Persona>() {
					@Override
					public int compare(Persona p1, Persona p2) {
						return p1.getEdad()-p2.getEdad(); //Ordena por edades
					}
				}
		); 
		
		*/
		/*
		
		personas.sort(			//Compara por edad y nombre
				(p1,p2) -> {
					Integer aux = p1.getEdad() - p2.getEdad();
					if (aux == 0) {
						return p1.getDescripcion().compareTo(p2.getDescripcion());
					}
					return aux;
				}
		);
		*/
		
		Comparator<Persona>	compEdad = (p1,p2) -> p1.getEdad()- p2.getEdad();
		Comparator<Persona> compNom  = (p1,p2) -> p1.getDescripcion().compareToIgnoreCase(p2.getDescripcion());
		Comparator<Persona> compDni  = (p1,p2) -> p1.getDocumento().compareTo(p2.getDocumento());
		
		personas.sort(compEdad.thenComparing(compNom.thenComparing(compDni)));
		
		//Modo funcional del foreach, mas eficiente
		personas.forEach(System.out::println);
		
		
		
		
	}

}
