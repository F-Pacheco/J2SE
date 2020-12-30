package com.educacionIT.digitalers.Clase02;

import com.educacionIT.digitalers.Entidades.Generica;
import com.educacionIT.digitalers.Entidades.GenericaObject;

public class App 
{
    public static void main( String[] args )
    {
        
    	//Usando clases genericas, definiendo los atributos como objeto
    	GenericaObject documento = new GenericaObject("Dni", "37469756456");
        GenericaObject suma = new GenericaObject(2, 3);
        
       //Obliga a que casteemos de objeto a un valor reconocido
       //por el operador "+"
        int total = (Integer) suma.getNumero()+ (Integer) suma.getTipo();
        
       
        //Usando clases genericas parametrizadas
        Generica<String, String> documento1 = new Generica<>("DNI", "254454");
        Generica<Integer, Integer> suma1 = new Generica<>(2, 3);
        
        //Nos evita el casteo
        int total1 = suma1.getTipo() + suma1.getNumero();
        
    }
}
