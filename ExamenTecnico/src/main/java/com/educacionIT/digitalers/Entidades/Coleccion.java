package com.educacionIT.digitalers.Entidades;

public class Coleccion {
	private String nombre;

	//Constructors
	public Coleccion() {
	}
	public Coleccion(String nombre) {
		this.nombre = nombre;
	}
	//Getters & Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Methods
	@Override
	public String toString() {
		return "Coleccion nombre: " + nombre;
	}
	
	public Integer getDuracion() {
		return 0;
	};
	
	public Integer getCantElementos() {
		return 0;
	};
	
}
