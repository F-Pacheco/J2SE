package com.educacionIT.digitalers.Clase02;

import java.util.HashSet;
import java.util.Set;

import com.educacionIT.digitalers.Entidades.Documento;

public class CollectionSetObjetos {

	public static void main(String[] args) {
		Set<Documento> dnis = new HashSet<>();
		dnis.add(new Documento("Dni","01"));
		dnis.add(new Documento("Dni","02"));
		dnis.add(new Documento("Dni","03"));
		dnis.add(new Documento("Dni","04"));
		dnis.add(new Documento("Dni","05"));
		
		//Comparando objetos a traves del metodo equals() y hash()
		//redefinidos en Documento
		
		Documento doc1 = new Documento("Dni","95");
		Documento doc2 = new Documento("Dni","95");
		
		System.out.println("Los documentos son iguales? " +doc1.equals(doc2));
		
		
		//Intentando agregar elemento duplicado
		System.out.println("Agregando elemento duplicado: "+	dnis.add(new Documento("Dni","05")));
		for (Documento documento : dnis) {
			System.out.println(documento);
		}
	}

}
