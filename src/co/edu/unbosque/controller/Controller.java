package co.edu.unbosque.controller;

import co.edu.unbosque.model.*;
import co.edu.unbosque.view.ViewConsola;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.concurrent.TimeUnit;

public class Controller {

	private ManejoArreglos manArrays;
	private QuickSort quickSort;
	private Burbuja burbuja;
	private Radix radix;
	private Shell shell;
	private ViewConsola vista;
	private long tiempoInicial;
	private long tiempoFinal;

	public Controller() {
		shell=new Shell();
		radix=new Radix();
		burbuja = new Burbuja();
		quickSort = new QuickSort();
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
					vista.mostrarMensaje("Empieza el ordenamiento...");
					long[] arreglo1= manArrays.getArreglo();
					tiempoInicial=System.currentTimeMillis();
					burbuja.ordenar(arreglo1);
					tiempoFinal=System.currentTimeMillis();
					vista.mostrarMensaje("Fin del ordenamiento\nTiempo tomado: "+(tiempoFinal-tiempoInicial));
					break;
				case 2:
					vista.mostrarMensaje("Empieza el ordenamiento...");
					long[] arreglo2= manArrays.getArreglo();
					tiempoInicial=System.nanoTime();
					radix.ordenar(arreglo2, arreglo2.length);
					tiempoFinal=System.nanoTime();
					vista.mostrarMensaje("Fin del ordenamiento\nTiempo tomado: "+(tiempoFinal-tiempoInicial));
					break;
				case 3:
					vista.mostrarMensaje("Empieza el ordenamiento...");
					long[] arreglo3 = manArrays.getArreglo();
					tiempoInicial=System.nanoTime();
					quickSort.ordenar(arreglo3, 0,arreglo3.length-1);
					tiempoFinal=System.nanoTime();
					vista.mostrarMensaje("Fin del ordenamiento\nTiempo tomado: "+ (tiempoFinal-tiempoInicial));
					vista.mostrarMensaje(""+arreglo3[arreglo3.length-1]);
					break;
				case 4:
					vista.mostrarMensaje("Empieza el ordenamiento...");
					long[] arreglo4= manArrays.getArreglo();
					tiempoInicial=System.currentTimeMillis();
					shell.ordenar(arreglo4);
					tiempoFinal=System.currentTimeMillis();
					vista.mostrarMensaje("Fin del ordenamiento\nTiempo tomado: "+(tiempoFinal-tiempoInicial));
					break;
				default:
					throw new InputMismatchException();
			}
		} catch (InputMismatchException e) {
			vista.mostrarMensaje("Ingrese una opción válida");
		}
	}
}
