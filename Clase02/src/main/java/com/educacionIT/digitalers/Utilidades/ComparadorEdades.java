package com.educacionIT.digitalers.Utilidades;

import java.util.Comparator;

import com.educacionIT.digitalers.Entidades.Persona;

public class ComparadorEdades implements Comparator<Persona>{

	//para ordenar por campos complejos
	@Override
	public int compare(Persona per1, Persona per2) {
		return per1.getEdad()-per2.getEdad();
	}
	
}
