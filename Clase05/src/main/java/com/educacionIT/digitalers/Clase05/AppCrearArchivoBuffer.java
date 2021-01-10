package com.educacionIT.digitalers.Clase05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AppCrearArchivoBuffer {

	public static void main(String[] args) {
		String separador = File.separator;
		File file = new File("C:"+separador+"archivos"+separador+"nombres2.txt"); 
		String[] nombres = {"Octavio", "Analia", "Mariana","Federico","Lautaro","Hector"};
		
		//PARA ESCRIBIR EN BUFFER
		/* 
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			for (String nombre : nombres) {
				bw.write(nombre);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		*/
		
		//PARA LEER EN BUFFER
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			String linea;
			while((linea = br.readLine())!= null){
				System.out.println(linea);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
