package com.educacionIT.digitalers.Entidades;

import java.util.Date;

public class Profesor extends Persona{
	private Double pago;

	//Constructors
	public Profesor() {
	}
	public Profesor(Documento documento, String descripcion, String direccion, Date fechaCreacion, Date fechaNacimiento,
			Boolean activo, Double pago) {
		super(documento, descripcion, direccion, fechaCreacion, fechaNacimiento, activo);
		this.pago = pago;
	}
	
	//Getter & Setter
	public Double getPago() {
		return pago;
	}
	public void setPago(Double pago) {
		this.pago = pago;
	}
	@Override
	public String toString() {
		return "Profesor " + super.toString() + ", pago: " + pago;
	}
	
	
	
	
	
	
	
	
}
