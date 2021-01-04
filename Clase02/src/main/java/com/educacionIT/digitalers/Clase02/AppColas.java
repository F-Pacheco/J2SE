package com.educacionIT.digitalers.Clase02;

import java.util.ArrayDeque;
import java.util.Deque;

public class AppColas {

	public static void main(String[] args) throws InterruptedException {
		Deque<String> cola = new ArrayDeque<>();
		
		cola.add("Octavio");
		cola.add("celeste");
		cola.add("Rafael");
		cola.add("Federico");
		cola.add("Mariana");
		cola.add("Lautaro");
		
		Thread.sleep(2000);
		
		while(!(cola.isEmpty())) {
			System.out.println(cola.poll());
			Thread.sleep(2000);
		}
	}

}
