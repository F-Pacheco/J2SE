package com.educacionIT.digitalers.Clase05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppCrearArchivos {

	public static void main(String[] args) {
		String separador = File.separator;
		
		File file = new File("C:"+separador+"archivos"+separador+"nombres.txt"); 
		
		String[] nombres = {"Octavio", "Analia", "Mariana","Federico","Lautaro","Hector"};
		
		//si al constructor le pasamos true,no borra lo que estaba escrito
		//si no le pasamos el booleano o le pasamos false, sobreescribe
		try (FileWriter fw = new FileWriter(file,false)){
			for (String nombreAux : nombres) {
				fw.write(nombreAux);
				fw.write("\n");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("FIN PROGRAMA");
	}

}
