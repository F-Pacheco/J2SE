package com.educacionIT.digitalers.Clase02;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {

	public static void main(String[] args) {
		List<String> nombres = new ArrayList<>();
		nombres.add("Fede");
		nombres.add("mariana");
		nombres.add("lautaro");
		nombres.add("analia");
		
		System.out.println("***********For Comun***********");
		for (int i = 0; i < nombres.size(); i++) {
			System.out.println(nombres.get(i));
		}
		
		nombres.add(2, "FLOR"); //mueve los elementos para "abajo"
		
		nombres.set(1, "ELIMINADO"); //reempleza lo que esta en esa posición
		
		nombres.remove(0);//elimina la posicion y lo que contenga
		
		nombres.clear();//elimina el arraylist
		
		System.out.println("***********ForEach***********");
		for (String string : nombres) {
			System.out.println(string);
		}
	}

}
