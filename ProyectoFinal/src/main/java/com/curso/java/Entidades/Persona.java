package com.curso.java.Entidades;

import java.io.Serializable;
import java.util.Date;

public abstract class Persona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Documento documento;
	private String descripcion;
	private Date fechaNacimiento;
	private Boolean activo;
	private Date fechaCreacion;
	
	//Constructors
	public Persona() {
	}
	public Persona(Documento documento, String descripcion, Date fechaNacimiento, Boolean activo, Date fechaCreacion) {
		this.documento = documento;
		this.descripcion = descripcion;
		this.fechaNacimiento = fechaNacimiento;
		this.activo = activo;
		this.fechaCreacion = fechaCreacion;
	}
	
	//Getters & Setters
	public Documento getDocumento() {
		return documento;
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	//Methods
	@Override
	public String toString() {
		return documento + " " + descripcion + ", Nacimiento: "
				+ fechaNacimiento + ", activo: " + activo + ", Creacion: " + fechaCreacion + " ";
	}
	
	
}
