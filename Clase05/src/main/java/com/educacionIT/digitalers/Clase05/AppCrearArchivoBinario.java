package com.educacionIT.digitalers.Clase05;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppCrearArchivoBinario {

	public static void main(String[] args) {
		String separador = File.separator;
		File file = new File("C:"+separador+"archivos"+separador+"Binario"+separador+"objetos.dat"); 
		
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))){
			Integer[] numeros = {1,2,3,4,5};//{"Octavio","Federico","Mariana","Analia"};
			for (Integer numero : numeros) {
				dos.writeInt(numero);
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}
