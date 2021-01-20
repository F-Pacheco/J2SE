package com.curso.java.interfaces;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface Patrones {
	static Boolean esCorreoValido(String correo) throws Exception {
		Pattern patron = Pattern.compile("^[^@]+@[^@]+\\.[a-zA-Z]{2,}$");
		Matcher comparacion = patron.matcher(correo);
		if(! comparacion.find()) {
			throw new Exception("Correo no valido");
		}
		return true;
	};
	
	static Boolean esClaveValida(String clave) throws Exception {
		Pattern patron = Pattern.compile("^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8,16}$");
		Matcher comparacion = patron.matcher(clave);
		if(! comparacion.find()) {
			throw new Exception("Clave no valida");
		}
		return true;
	}
	
}
