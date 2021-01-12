package com.educacionIT.digitalers.Clase06;

import com.educacionIT.digitalers.Implementaciones.CalculadoraImp;
import com.educacionIT.digitalers.Interfaces.OperacionMatematica;

public class App 
{
    public static void main( String[] args )
    {
    	CalculadoraImp calculadora = new CalculadoraImp();
    	System.out.println(calculadora.suma(5,5));
    	System.out.println(calculadora.restar(2, 4));
    	System.out.println(calculadora.dividir(16, 4));
    	System.out.println(calculadora.multiplicar(10, 5));
    	
    	//Usando clases anonimas
    	OperacionMatematica operSuma = new OperacionMatematica() {
			@Override
			public Integer operar(Integer a, Integer b) {
				return a + b;
			}
		};
		System.out.println(operSuma.operar(7, 8));
		
		//Usando Programacion funcional
		//lambda P -> retorno
    	
		OperacionMatematica suma = (a,b) -> a + b;
		OperacionMatematica division = 
				(a, b) -> {
					if (b == 0) {
						return 0;
					}
					return a / b;
				};
		System.out.println("Suma funcional: " +suma.operar(5, 10));
		System.out.println("Division funcional: "+division.operar(15, 0));
		
    }
}
