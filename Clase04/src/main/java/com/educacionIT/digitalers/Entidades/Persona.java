package com.educacionIT.digitalers.Entidades;

import java.util.Date;

public abstract class Persona {
	private Documento documento;
	private String descripcion;
	private String direccion;
	private Date fechaCreacion;
	private Date fechaNacimiento;
	private Boolean activo;
	
	//Constructors
	public Persona() {
	}
	public Persona(Documento documento, String descripcion, String direccion, Date fechaCreacion, Date fechaNacimiento,
			Boolean activo) {
		this.documento = documento;
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.fechaCreacion = fechaCreacion;
		this.fechaNacimiento = fechaNacimiento;
		this.activo = activo;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
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
	
	//Methods
	@Override
	public String toString() {
		return  descripcion + " " + documento + ", direccion: " + direccion
				+ ", fechaCreacion: " + fechaCreacion + ", fechaNacimiento: " + fechaNacimiento + ", activo: " + activo;
	}
	
	
	
	
	
	
}
