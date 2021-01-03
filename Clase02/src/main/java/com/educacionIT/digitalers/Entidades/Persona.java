package com.educacionIT.digitalers.Entidades;

public class Persona implements Comparable<Persona>{
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((documento == null) ? 0 : documento.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (documento == null) {
			if (other.documento != null)
				return false;
		} else if (!documento.equals(other.documento))
			return false;
		return true;
	}
	@Override
	public int compareTo(Persona persona) {
		return this.id - persona.getId();
	}
	
	
	
	
}
