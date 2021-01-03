package com.educacionIT.digitalers.Clase02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.educacionIT.digitalers.Entidades.Generica;
import com.educacionIT.digitalers.Entidades.Persona;

public class CollectionListObject {

	public static void main(String[] args) {
		List<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona(1,"OR",new Generica<String,String>("Dni","03"),(byte)25,new Generica<String,Integer>("+54",123456)));
		personas.add(new Persona(2,"FP",new Generica<String,String>("Dni","05"),(byte)26,new Generica<String,Integer>("+54",12245456)));
		personas.add(new Persona(3,"MB",new Generica<String,String>("Dni","01"),(byte)23,new Generica<String,Integer>("+54",65453456)));
		personas.add(new Persona(4,"GH",new Generica<String,String>("Dni","01"),(byte)30,new Generica<String,Integer>("+54",65453456)));
		
		
		for (Persona persona : personas) {
			System.out.println(persona);
		}
		System.out.println("====================================");
		
		personas.sort(
				new Comparator<Persona>() {
					@Override
					public int compare(Persona per1, Persona per2) {
						return - (per1.getEdad()-per2.getEdad());
					}	
				}
		);  //ordena segun edades
		
		for (Persona persona : personas) {
			System.out.println(persona);
		}
	}

}
