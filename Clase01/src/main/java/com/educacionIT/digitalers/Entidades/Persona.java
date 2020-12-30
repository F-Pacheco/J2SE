package com.educacionIT.digitalers.Entidades;

import com.educacionIT.digitalers.Exceptions.ExceptionEducacionIT;

public class Persona implements AutoCloseable{
	private Integer id;
	private String nombre;
	private Byte edad;
	
	//Getters and Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) throws ExceptionEducacionIT {
		if (nombre.length()<8) {
			throw new ExceptionEducacionIT(2);
		}
		this.nombre = nombre;
	}
	
	public Byte getEdad() {
		return edad;
	}
	public void setEdad(Byte edad) throws ExceptionEducacionIT {
		if (edad < 0) {
			throw new ExceptionEducacionIT(1);
		}
		this.edad = edad;
	}
	
	//Constructors
	public Persona() {
	}
	
	public Persona(Integer id, String nombre, Byte edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
	//Methods
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}
	
	public void close() throws Exception {
		System.out.println("Closing...");
		
	}
	
	
	
	
	
}
