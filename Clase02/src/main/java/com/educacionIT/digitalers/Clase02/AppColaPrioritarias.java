package com.educacionIT.digitalers.Clase02;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class AppColaPrioritarias {

	public static void main(String[] args) throws InterruptedException {
		Queue<String> cola = new PriorityQueue<String>(
									new Comparator<String>() {
										@Override
										public int compare(String name1, String name2) {
											return name1.compareToIgnoreCase(name2);
										}
										
									}
								);
		
		cola.add("Octavio");
		cola.add("celeste");
		cola.add("Rafael");
		cola.add("Federico");
		cola.add("Mariana");
		cola.add("Lautaro");
		
		Thread.sleep(2000);
		
		while (!cola.isEmpty()) {
			System.out.println(cola.peek());
			cola.poll();
			Thread.sleep(2000);
			
		}
		
	}

}
