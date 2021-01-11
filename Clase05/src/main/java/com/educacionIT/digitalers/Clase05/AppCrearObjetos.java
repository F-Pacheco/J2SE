package com.educacionIT.digitalers.Clase05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AppCrearObjetos {

	public static void main(String[] args) {
		String separador = File.separator;
		File file = new File("C:"+separador+"archivos"+separador+"Binario"+separador+"Personas.dat"); 
		
		Persona per1 = new Persona("Federico", "Pacheco", "omaha", (byte)25, true,36000.00f);
		Persona per2 = new Persona("Lautaro", "Tico", "ciudadela", (byte)27, false,48000.00f);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
			oos.writeObject(per1);
			oos.writeObject(per2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
