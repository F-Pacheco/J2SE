package com.educacionIT.digitalers.Entidades;

public class Persona {
	private Integer id;
	private String razonSocial;
	private Generica<String,String> documento;
	private Byte edad;
	private Generica<String, Integer> telefono;
	
	//Constructors
	public Persona() {
	}
	public Persona(Integer id, String razonSocial, Generica<String, String> documento, Byte edad,
			Generica<String, Integer> telefono) {
		this.id = id;
		this.razonSocial = razonSocial;
		this.documento = documento;
		this.edad = edad;
		this.telefono = telefono;
	}
	
	//Getters & Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public Generica<String, String> getDocumento() {
		return documento;
	}
	public void setDocumento(Generica<String, String> documento) {
		this.documento = documento;
	}
	public Byte getEdad() {
		return edad;
	}
	public void setEdad(Byte edad) {
		this.edad = edad;
	}
	public Generica<String, Integer> getTelefono() {
		return telefono;
	}
	public void setTelefono(Generica<String, Integer> telefono) {
		this.telefono = telefono;
	}
	
	//Methods
	@Override
	public String toString() {
		return "Persona [id=" + id + ", razonSocial=" + razonSocial + ", documento=" + documento + ", edad=" + edad
				+ ", telefono=" + telefono + "]";
	}
	
	
	
	
}
