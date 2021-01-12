package com.educacionIT.digitalers.Entidades;

public class Usuario {
	private Integer id;
	private String descripcion;
	private String clave;
	
	//Constructors
	public Usuario() {
	}

	public Usuario(Integer id, String descripcion, String clave) {
		this.id = id;
		this.descripcion = descripcion;
		this.clave = clave;
	}

	//Getters & Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
		return  id + "| " + descripcion + " -> " + clave;
	}
	
	
}
