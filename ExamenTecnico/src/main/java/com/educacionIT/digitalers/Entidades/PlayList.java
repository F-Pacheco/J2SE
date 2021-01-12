package com.educacionIT.digitalers.Entidades;

import java.util.ArrayList;
import java.util.List;

public class PlayList extends Coleccion{
	protected List<Coleccion> elementos;

	//constructors
	public PlayList(String nombre) {
		super(nombre);
		elementos = new ArrayList<Coleccion>();
	}
	
	//Getters & setters
	public List<Coleccion> getElementos() {
		return elementos;
	}
	public void setElementos(List<Coleccion> elementos) {
		this.elementos = elementos;
	}

	//methods
	@Override
	public Integer getDuracion() {
		Integer contador = 0;
		for (Coleccion coleccion : elementos) {
			contador = contador + coleccion.getDuracion();
		}
		return contador;
	}

	@Override
	public Integer getCantElementos() {
		return elementos.size();
	}
	
	public Boolean addElemento (Coleccion elemento) {
		if (!elementos.contains(elemento)) {		//para no añadir repetidos
			elementos.add(elemento);
			return true;
		}
		return false;
	}
	
	public Boolean removeElemento (Coleccion elemento) {
		if (elementos.contains(elemento)) {
			elementos.remove(elemento);
			return true;
		}
		return false;
	}
}
