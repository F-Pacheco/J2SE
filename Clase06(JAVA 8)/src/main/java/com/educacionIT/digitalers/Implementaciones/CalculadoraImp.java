package com.educacionIT.digitalers.Implementaciones;

import com.educacionIT.digitalers.Interfaces.Calculadora;

public class CalculadoraImp implements Calculadora {

	@Override
	public Integer suma(Integer a, Integer b) {
		return a+b;
	}

	@Override
	public Integer restar(Integer a, Integer b) {
		return a-b;
	}

	@Override
	public Integer multiplicar(Integer a, Integer b) {
		return a*b;
	}

	@Override
	public Integer dividir(Integer a, Integer b) {
		if (b == 0) {
			return 0;
		}
		return a/b;
	}
	
}
