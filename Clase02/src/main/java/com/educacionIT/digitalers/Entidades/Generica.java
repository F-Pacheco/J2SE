package com.educacionIT.digitalers.Entidades;

public final class Generica<T,N>{
	private T tipo;
	private N numero;
	
	
	//Constructors
	public Generica() {
	}
	public Generica(T tipo, N numero) {
		this.tipo = tipo;
		this.numero = numero;
	}
	//Getters & Setters
	public T getTipo() {
		return tipo;
	}
	public void setTipo(T tipo) {
		this.tipo = tipo;
	}
	public N getNumero() {
		return numero;
	}
	public void setNumero(N numero) {
		this.numero = numero;
	}
	
	
	@Override
	public String toString() {
		return "Generica [tipo=" + tipo + ", numero=" + numero + "]";
	}
	
	
	
	
}
