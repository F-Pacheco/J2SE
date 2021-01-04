package com.educacionIT.digitalers.Clase02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.educacionIT.digitalers.Entidades.Documento;

public class App2 {

	public static void main(String[] args) {
		final List<String> comparador = Arrays.asList("DNI","CI","LE");	//Para obtener los documentos ordenados segun la secuencia DNI, CI, LE
		
		List<Documento> documentos = new ArrayList<>();
		documentos.add(new Documento("DNI","02"));
		documentos.add(new Documento("Dni","04"));
		documentos.add(new Documento("Dni","01"));
		documentos.add(new Documento("DNI","03"));
		documentos.add(new Documento("LE","02"));
		documentos.add(new Documento("LE","01"));
		documentos.add(new Documento("lE","03"));
		documentos.add(new Documento("CI","02"));
		documentos.add(new Documento("Ci","01"));
		documentos.add(new Documento("Ci","03"));
		

		documentos.sort(
				new Comparator<Documento>() {
					@Override
					public int compare(Documento dni1, Documento dni2) {
						Integer tipo = dni1.getTipo().toUpperCase().compareTo(dni2.getTipo().toUpperCase());
						if(tipo == 0) { 
							return dni1.getNum().compareTo(dni2.getNum());
						}
						return  comparador.indexOf(dni1.getTipo().toUpperCase()) - comparador.indexOf(dni2.getTipo().toUpperCase());
					}
					
				}
		);
		for (Documento documento : documentos) {
			System.out.println(documento);
		}
		
		
		
		
		
		
		
		
	}

}
