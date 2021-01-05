package com.educacionIT.digitalers.Clase02;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.educacionIT.digitalers.Entidades.Generica;
import com.educacionIT.digitalers.Entidades.Persona;

public class AppMapPersona {

	public static void main(String[] args) {
		Map<Generica<String,String>,Persona> personas = new HashMap<>();
		
		Persona per1= new Persona(1, "Federico", new Generica<String,String>("DNI","1245445"), null, null);
		Persona per2= new Persona(2, "Maximiliano", new Generica<String,String>("DNI","56456231"), null, null);
		
		
		personas.put(per1.getDocumento(), per1);
		personas.put(per2.getDocumento(), per2);
		
		for (Entry<Generica<String,String>,Persona> persona : personas.entrySet()) {
			System.out.println(persona.getKey()+" -> "+persona.getValue().getRazonSocial());
		}
	}

}
