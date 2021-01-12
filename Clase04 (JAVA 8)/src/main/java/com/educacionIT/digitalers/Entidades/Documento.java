package com.educacionIT.digitalers.Entidades;

public final class Documento {
	private String tipoDocumento;
	private String numeroDocumento;
	
	//Constructors
	public Documento() {
	}
	public Documento(String tipoDocumento, String numeroDocumento) {
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}
	
	//Getters & Setters
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	
	//Methods
	@Override
	public String toString() {
		return tipoDocumento + " " + numeroDocumento;
	}
	
	
	
	
}
