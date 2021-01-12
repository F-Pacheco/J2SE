package com.educacionIT.digitalers.Interfaces;

//Esta anotación sirve para avisar al programador de que no agruege mas metodos
@FunctionalInterface
public interface OperacionMatematica {
	
	//Solo puede tener un metodo
	Integer operar(Integer a, Integer b);
	
}
