package com.educacionIT.digitalers.Clase05;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AppLeerObjeto {

	public static void main(String[] args) {
		String separador = File.separator;
		File file = new File("C:"+separador+"archivos"+separador+"Binario"+separador+"Personas.dat"); 
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
			while(true) {
				Persona perAux =(Persona) ois.readObject();
				System.out.println(perAux);
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e) {
			System.out.println("==================");
			System.out.println("Fin de los objetos");
		}catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
