package com.educacionIT.digitalers.Clase05;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppLeerCrearBinario {

	public static void main(String[] args) {
		String separador = File.separator;
		File file = new File("C:"+separador+"archivos"+separador+"img.svg"); 
		File file2 = new File("C:"+separador+"archivos"+separador+"img2.svg"); 
		
		try(FileInputStream fis = new FileInputStream(file)) {
			FileOutputStream fos = new FileOutputStream(file2);
			int elemento;
			while ((elemento = fis.read())!=-1) {
				fos.write(elemento);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}
