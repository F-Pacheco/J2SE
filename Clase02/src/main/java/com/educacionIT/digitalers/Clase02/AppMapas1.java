package com.educacionIT.digitalers.Clase02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class AppMapas1 {

	public static void main(String[] args) {
		Map<Integer, String> nombres = new HashMap<Integer, String>();
		nombres.put(1, "Octavio");
		nombres.put(2, "Federico");
		nombres.put(3, "Mariana");
		nombres.put(4, "Celeste");
		
		System.out.println(nombres);
		System.out.println("Obteniendo a: "+nombres.get(2));
		System.out.println("Removiendo a: "+nombres.remove(4));
		System.out.println("Contienes clave 1? "+nombres.containsKey(1));
		System.out.println("Contienes valor Mariana? "+nombres.containsValue("Mariana"));
	
		System.out.println("==========");
		
		for (Entry<Integer, String> nombre : nombres.entrySet()) {
			Integer clave = nombre.getKey();
			String valor = nombre.getValue();
			System.out.println(clave+" -> "+valor);
		}
		
		//Al igual que las collections no se puede eliminar mientras se recorre
		//por ello usamos iterator
		
		System.out.println(nombres);
		System.out.println("==========ITERANDO============");
		
		Iterator<Entry<Integer,String>> iterador = nombres.entrySet().iterator();
		while (iterador.hasNext()) {
			Entry<Integer,String> elemento = iterador.next();
			if (elemento.getValue().equalsIgnoreCase("octavio")) {
				System.out.println("Removiendo a: "+elemento.getValue());
				iterador.remove();
			}
			System.out.println(elemento);
		}
		System.out.println("==========FIN============");
		System.out.println(nombres);
	}

}
