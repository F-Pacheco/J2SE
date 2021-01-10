package com.educacionIT.digitalers.Clase05;

import java.io.File;
import java.util.Arrays;

public class AppBuscarBorrarArchivos {

	public static void main(String[] args) {
		
		String separador = File.separator; //usa el separador del sistema
	
		File file = new File("C:"+separador+"archivos"+separador+"binario"+separador+"prueba.txt"); 
		
		//Para saber caracteristicas de la direccion
		System.out.println("Eres carpeta? "+file.isDirectory());
		System.out.println("Eres archivo? "+file.isFile());
		System.out.println("Existes? "+file.exists());
		System.out.println("Lista de elementos: "+ Arrays.toString(file.list()));
		System.out.println("=================");
		
		//Eliminar elemento  -->  file.delete();
		
		if(file.isDirectory()) {
			listarCarpeta(file);
		}
		
	}
	
	static void listarCarpeta(File file) {
		for (File fileAux :file.listFiles()) {
			System.out.println(
					fileAux.getName()+" - "+(fileAux.isDirectory()?"Directorio":"Archivo")
					);
			if(fileAux.isDirectory()) {
				System.out.println("=======");
				listarCarpeta(fileAux);
				System.out.println("=======");
			}
		}
	}

}
