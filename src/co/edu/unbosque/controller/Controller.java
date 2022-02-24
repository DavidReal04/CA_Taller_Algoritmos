package co.edu.unbosque.controller;

import java.util.ArrayList;

public class Controller {
	
	public Controller() {
		funcionar();
	}

	public void funcionar() {
		
		ArrayList<Integer> arreglo1 = new ArrayList<>();
		
		for (int i = 0; i <= 40000000; i++) {
			
			arreglo1.add(i, i);
			
		}
		
		System.out.println(arreglo1.size());
		
	}
}
