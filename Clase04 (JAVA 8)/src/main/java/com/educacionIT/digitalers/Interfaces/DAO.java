package com.educacionIT.digitalers.Interfaces;

import java.util.List;

public interface DAO<E,K> {
	void insertar(E elemento);
	void eliminar(E elemento);
	void actualizar(E elemento);	
	E buscarPorId(K key);
	List<E> listar();
}
