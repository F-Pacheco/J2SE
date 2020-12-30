package com.educacionIT.digitalers.Exceptions;

public class ExceptionEducacionIT extends Exception {
	private static final long serialVersionUID = 1L;
	private String mensaje;
	private Integer id;
	
	
	
	public ExceptionEducacionIT( Integer id) {
		//this.mensaje = mensaje;
		this.id = id;
	}


	public String getMessage() {
		String message= null;
		switch (id) {
		case 1:
			message = "La edad no permite negativos";
			break;
		case 2:
			message = "El nombre no debe ser menor a 8 caracteres";
			break;
		}
		return message;
		
		
	}
}
