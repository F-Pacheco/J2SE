package com.educacionIT.digitalers.Clase06;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.educacionIT.digitalers.Entidades.Persona;

public class AppFilter {

	public static void main(String[] args) {
		// List<String> nombres = Arrays.asList("Fede","Octavio","Lautaro","Daniela","Hector","Mariana");
		
		List<Persona> personas = Arrays.asList(
				new Persona("Federico", "01", (byte) 19),
				new Persona("Octavio", "05", (byte) 15),
				new Persona("octavio", "02", (byte) 15),
				new Persona("Roberto", "03", (byte) 30),
				new Persona("Axel", "06", (byte) 30),
				new Persona("Ricardo", "04", (byte) 20)
				);
		
		List<String> nombres = personas.stream().map(Persona :: getDescripcion).collect(Collectors.toList());
		nombres.forEach(System.out :: println);
		
		System.out.println("-----NOMBRES CON A-------");
		List<String> nombresConA = nombres.stream().filter(e -> e.contains("a") || e.contains("A")).collect(Collectors.toList());
		nombresConA.forEach(System.out :: println);
		
		String nombresReduce = nombres.stream().reduce("Inicio", (e1,e2)->e1.concat(", ").concat(e2));
		System.out.println(nombresReduce);

		
		
		List<Byte> numeros = personas.stream().map(Persona :: getEdad).collect(Collectors.toList());
		numeros.forEach(System.out :: println);
		
		System.out.println("-----NUMEROS PARES-------");
		List<Byte> numerosPar = numeros.stream().filter(e -> (e%2) == 0).collect(Collectors.toList());
		numerosPar.forEach(System.out :: println);
		
		List<Integer> mapeoInteger = personas.stream().map(e -> e.getEdad().intValue()).collect(Collectors.toList()); //Porque no se puede operar con bytes
		Integer numerosReduce = mapeoInteger.stream().reduce(0, (e1,e2)->e1+e2);
		
		System.out.println("PROMEDIO DE EDAD: "+numerosReduce/personas.size());
		
	}

}
