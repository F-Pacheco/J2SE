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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}
	
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Generica other = (Generica) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}
	
	
	
	
}
