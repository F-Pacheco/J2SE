package com.educacionIT.digitalers.Clase05;

import java.io.Serializable;

public class Persona implements Serializable{
	private String nombre;
	private String apellido;
	private String direccion;
	private Byte edad;
	private Boolean activo;
	private Float pago;
	
	//Constructors
	public Persona(){
	}
	public Persona(String nombre, String apellido, String direccion, Byte edad, Boolean activo, Float pago) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.activo = activo;
		this.pago = pago;
	}
	
	//Getters & Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Byte getEdad() {
		return edad;
	}
	public void setEdad(Byte edad) {
		this.edad = edad;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	public Float getPago() {
		return pago;
	}
	public void setPago(Float pago) {
		this.pago = pago;
	}
	//Methods
	@Override
	public String toString() {
		return "Persona " + nombre + ", " + apellido + ", direccion: " + direccion + ", edad: " + edad
				+ ", activo: " + activo + ", pago: "+ pago;
	}
	
	
	
	



}
