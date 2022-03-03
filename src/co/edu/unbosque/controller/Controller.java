package co.edu.unbosque.controller;

import co.edu.unbosque.model.ManejoArreglos;
import co.edu.unbosque.view.ViewConsola;

import java.util.InputMismatchException;

public class Controller {

	private ManejoArreglos manArrays;
	private ViewConsola vista;

	public Controller() {
		manArrays = new ManejoArreglos();
		vista = new ViewConsola();
		funcionar();
	}

	public void funcionar() {
		try {
			vista.mostrarMensaje("Algortimos de Ordenamiento\nIngrese el nùmero del algoritmo a utilizar:");
			int algoritmo = vista.leerNum("1.Burbuja	2.Radix 	3.Quicksort 	4.Shell");
			int datos = vista.leerNum("Ingrese la cantidad de datos a ordenar\n1. 4 mil 	2. 40 mil 	3. 400 mil 	4. 4 millones 	5. 40 millones");
			int caso = vista.leerNum("Ingrese que caso quiere evaluar\n1. Mejor caso	2. Caso medio	3.Peor caso");
			switch (datos) {
				case 1:
					manArrays.generarArreglo(4000, caso);
					break;
				case 2:
					manArrays.generarArreglo(40000, caso);
					break;
				case 3:
					manArrays.generarArreglo(400000, caso);
					break;
				case 4:
					manArrays.generarArreglo(4000000, caso);
					break;
				case 5:
					manArrays.generarArreglo(40000000, caso);
					break;
				default:
					throw new InputMismatchException();
			}
			switch (algoritmo) {
				case 1:

					break;
				case 2:

					break;
				case 3:

					break;
				case 4:

					break;
				default:
					throw new InputMismatchException();
			}
		} catch (InputMismatchException e) {
			vista.mostrarMensaje("Ingrese una opción válida");
		}
	}
}
