package com.curso.java.interfaces;

import java.util.List;

public interface DAO <E,K>{
	void insertar(E e);
	void actualizar (E e);
	void eliminar(E e);
	E buscar(K k);
	List<E> listar();
}
