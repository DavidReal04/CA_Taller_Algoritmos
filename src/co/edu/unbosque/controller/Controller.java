package co.edu.unbosque.controller;

import co.edu.unbosque.model.ManejoArreglos;
import co.edu.unbosque.view.ViewConsola;

public class Controller {

	private ManejoArreglos manArrays;
	private ViewConsola vista;

	public Controller() {
		manArrays = new ManejoArreglos();
		vista = new ViewConsola();
		funcionar();
	}

	public void funcionar() {

		manArrays.generarArreglo(40000000, "Medio");
		vista.mostrarMensaje((""+manArrays.getArreglo().size()));

	}
}
