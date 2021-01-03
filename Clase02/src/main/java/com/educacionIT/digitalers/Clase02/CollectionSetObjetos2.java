package com.educacionIT.digitalers.Clase02;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.educacionIT.digitalers.Entidades.Generica;
import com.educacionIT.digitalers.Entidades.Persona;
import com.educacionIT.digitalers.Utilidades.ComparadorEdades;

public class CollectionSetObjetos2 {

	public static void main(String[] args) {
		//para ordenar por campos complejos
		//ComparadorEdades edad = new ComparadorEdades();
		//ComparadorNombre nombre = new ComparadorNombre();
		
		//CLASES ANONIMAS
		Comparator<Persona> idDescendente = new Comparator<Persona>() {
			@Override
			public int compare(Persona per1, Persona per2) {
				return per2.getId()-per1.getId();
			}
			
		};
		Set<Persona> personas = new TreeSet<>(idDescendente);
		personas.add(new Persona(1,"OR",new Generica<String,String>("Dni","03"),(byte)25,new Generica<String,Integer>("+54",123456)));
		personas.add(new Persona(2,"FP",new Generica<String,String>("Dni","05"),(byte)26,new Generica<String,Integer>("+54",12245456)));
		personas.add(new Persona(3,"MB",new Generica<String,String>("Dni","01"),(byte)23,new Generica<String,Integer>("+54",65453456)));
		personas.add(new Persona(4,"GH",new Generica<String,String>("Dni","01"),(byte)30,new Generica<String,Integer>("+54",65453456)));
		
		for (Persona persona : personas) {
			System.out.println(persona);
		}
	}
}

class ComparadorNombre implements Comparator<Persona>{
	@Override
	public int compare(Persona per1, Persona per2) {
		return per1.getRazonSocial().compareTo(per2.getRazonSocial());
	}
}
