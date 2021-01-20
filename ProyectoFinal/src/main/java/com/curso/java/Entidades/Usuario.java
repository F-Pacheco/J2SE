package com.curso.java.Entidades;

import java.io.Serializable;

import com.curso.java.interfaces.Patrones;

public class Usuario implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String descripcion;
	private String clave;
	private Boolean activo;
	
	//Constructors
	public Usuario() {
	}
	public Usuario(String descripcion, String clave, Boolean activo) throws Exception {
		setDescripcion(descripcion);
		setClave(clave);
		this.activo = activo;
	}

	//Getters & setters
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) throws Exception {
		if(! Patrones.esCorreoValido(descripcion)) {
			this.descripcion = null;
		}
		this.descripcion = descripcion;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) throws Exception {
		if (! Patrones.esClaveValida(clave)) {
			this.clave = null;
		}
		this.clave = clave;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	//Methods
	@Override
	public String toString() {
		return "Usuario " + descripcion + ", clave: " + clave + ", activo: " + activo;
	}
	
	
	
	
}
