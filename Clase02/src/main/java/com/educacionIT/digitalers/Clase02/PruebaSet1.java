package com.educacionIT.digitalers.Clase02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PruebaSet1 {
	public static void main(String[] args) {
		Set<String> nombres = new HashSet<String>();
		
		//Ver si esta vacio
		System.out.println("Esta vacio? "+nombres.isEmpty());
		
		//agregar elementos
		nombres.add("Octavio");
		nombres.add("Fede");
		nombres.add("Mariana");
		nombres.add("Celeste");
		nombres.add("Lautaro");
		// añadir un duplicado
		System.out.println("Agregando duplicado de celeste: "+nombres.add("Celeste"));
		
		System.out.println("---------------");
		
		//cantidad de elementos
		System.out.println("Cantidad de elementos: "+nombres.size());
		
		System.out.println("---------------");
		//preguntar si contiene elemento
		System.out.println("Contienes a octavio? "+nombres.contains("Octavio"));
		System.out.println("contienes a jose? "+nombres.contains("Jose"));
		
		System.out.println("---------------");
		//para recorrerlo nose puede usar un for normal porque no hay indice
		//por lo tanto se usa el foreach
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		
		System.out.println("---------------");
		//eliminar
		nombres.remove("Lautaro");
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		
		System.out.println("---------------");
		
		//colleciones incluidas en otras
		Set<String> nombresMitologicos = new HashSet<String>();
		nombresMitologicos.add("Fede");
		nombresMitologicos.add("Thor");
		System.out.println("Nombres: "+ nombres);
		System.out.println("NombresMitologicos: "+nombresMitologicos);
		
		System.out.println("Nombres contiene a nombres mitologicos? "+nombres.containsAll(nombresMitologicos));
		
		System.out.println("---------------");
		//añadir coleccion
		nombres.addAll(nombresMitologicos);
		System.out.println("Coleccion añadida: "+nombres);
		
		//No podemos modificar el hashset mientras lo recorremos, por ello
		//debemos usar la interfaz iterator, que hace una copia del objeto
		//y es la cual podemos ir recorriendo y luego se encarga de modificar
		//los elementos que querramos
		
		System.out.println("---------------");
		
		Iterator<String> iterador = nombres.iterator();
		System.out.println("ITerando...");
		while (iterador.hasNext()) {
			String elemento = (String) iterador.next();
			if(elemento.startsWith("F")) {
				System.out.println(elemento+" <- Este es un capo");
			}else {
				System.out.println(elemento);
			}
			
			
			
		}
		
	}
}
