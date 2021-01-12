package com.educacionIT.digitalers.Entidades;

public class Persona {
	private String descripcion;
	private String documento;
	private Byte edad;
	
	//Constructors
	public Persona(String descripcion, String documento, Byte edad) {
		this.descripcion = descripcion;
		this.documento = documento;
		this.edad = edad;
	}
	public Persona() {
	}
	
	//Getters & Setters
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public Byte getEdad() {
		return edad;
	}
	public void setEdad(Byte edad) {
		this.edad = edad;
	}
	
	//Methods
	@Override
	public String toString() {
		return "Persona " + descripcion + " " + documento + ", edad: " + edad;
	}
	
	
}
