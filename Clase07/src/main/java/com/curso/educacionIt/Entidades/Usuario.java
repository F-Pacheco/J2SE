package com.curso.educacionIt.Entidades;

import java.io.Serializable;

public class Usuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String descripcion;
	private String clave;
	
	public Usuario(String descripcion, String clave) {
		this.descripcion = descripcion;
		this.clave = clave;
	}
	
	public Usuario() {
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "Usuario [descripcion=" + descripcion + ", clave=" + clave + "]";
	}
	
	
	
	
	
}
