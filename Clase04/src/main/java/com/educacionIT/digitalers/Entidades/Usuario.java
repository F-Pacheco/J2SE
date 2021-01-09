package com.educacionIT.digitalers.Entidades;

public class Usuario {
	private String descripcion;
	private String clave;
	
	//Constructors
	public Usuario() {
	}
	public Usuario(String descripcion, String clave) {
		this.descripcion = descripcion;
		this.clave = clave;
	}
	
	//Getters & Setters
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	//Methods
	@Override
	public String toString() {
		return "Usuario " + descripcion + ", clave: " + clave;
	}
	
	
}
