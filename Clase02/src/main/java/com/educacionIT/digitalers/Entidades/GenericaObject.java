package com.educacionIT.digitalers.Entidades;

public class GenericaObject {
	private Object tipo;
	private Object numero;
	
	//Constructor
	public GenericaObject() {
	}
	
	public GenericaObject(Object tipo, Object numero) {
		this.tipo = tipo;
		this.numero = numero;
	}

	//Getters & Setters
	public Object getTipo() {
		return tipo;
	}

	public void setTipo(Object tipo) {
		this.tipo = tipo;
	}

	public Object getNumero() {
		return numero;
	}

	public void setNumero(Object numero) {
		this.numero = numero;
	}
	
	
}
