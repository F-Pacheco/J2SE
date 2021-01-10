package com.educacionIT.digitalers.Clase04;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.educacionIT.digitalers.Entidades.Alumno;
import com.educacionIT.digitalers.Entidades.Documento;
import com.educacionIT.digitalers.Implementaciones.mariadb.AlumnoImplementacion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException
    {
    	/*
    	Alumno alumnoAux = new Alumno();
    	alumnoAux.setDocumento(new Documento("DNI","06"));
    	alumnoAux.setDescripcion("Roberto");
    	alumnoAux.setDireccion("Jujuy");
    	alumnoAux.setActivo(true);
    	alumnoAux.setFechaNacimiento(new SimpleDateFormat("yyyy-MM-dd").parse("1995-10-18"));
    	*/
    	
    	AlumnoImplementacion alumnoImp = new AlumnoImplementacion();
    	
    	System.out.println(alumnoImp.buscarPorId(new Documento("DNI","06")));
    	
    	System.out.println("==================");
 
    	for (Alumno alumno : alumnoImp.listar()) {
    		System.out.println(alumno);
		}
    	
    	
    }
}
