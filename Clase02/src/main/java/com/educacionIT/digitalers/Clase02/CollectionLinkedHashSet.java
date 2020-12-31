package com.educacionIT.digitalers.Clase02;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionLinkedHashSet {
	public static void main(String[] args) {
		Set<String> nombres = new LinkedHashSet<String>();
		
		//agregar elementos
		nombres.add("Octavio");
		nombres.add("Fede");
		nombres.add("Mariana");
		nombres.add("Celeste");
		nombres.add("Lautaro");
		
		//Los muestra de manera ordenada dependiendo del orden de ingreso
		for (String nombreAux : nombres) {
			System.out.println(nombreAux);
		}
	}
}
