package com.educacionIT.digitalers.Clase05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AppLeerArchivo {

	public static void main(String[] args) {
		String separador = File.separator;
		
		File file = new File("C:"+separador+"archivos"+separador+"nombres.txt"); 
		
		try(FileReader fr = new FileReader(file)){
			int elemento;
			while ((elemento = fr.read()) != -1) {
				System.out.print((char)elemento);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}
