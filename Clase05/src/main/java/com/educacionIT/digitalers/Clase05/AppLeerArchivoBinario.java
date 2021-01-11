package com.educacionIT.digitalers.Clase05;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AppLeerArchivoBinario {

	public static void main(String[] args) {
		String separador = File.separator;
		File file = new File("C:"+separador+"archivos"+separador+"Binario"+separador+"objetos.dat"); 
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
			while(true) {
				System.out.println(dis.readInt());
			}
		} catch (EOFException e) {	//Para manejar el fin de los archivos 
			System.out.println("==================");
			System.out.println("Fin de los objetos");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
