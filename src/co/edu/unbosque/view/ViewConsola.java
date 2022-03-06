package co.edu.unbosque.view;

import java.util.Scanner;
/**
 * Clase ViewConsola
 *
 * Clase de la vista que cuenta con 3 metodos, el constructor, otro de tipo void y uno tipo int.
 *
 * @author David Real
 * @author Yilber Rojas
 */
public class ViewConsola {
    /**
     * Objeto de Scanner
     */
    public Scanner leer;

    /**
     * Método constructor de la clase ViewConsola
     */
    public ViewConsola() {
        leer = new Scanner(System.in);
    }

    /**
     * Método mostrarMensaje de la clase ViewConsola
     * @param mensaje String con el mensaje que se desea impimir
     */
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    /**
     * Método leerNum de la clase ViewConsola
     * @return Número leìdo por consola
     */
    public int leerNum() {
        int dato = 0;
        dato = leer.nextInt();
        return dato;
    }

    /**
     * Método leerNum de la clase ViewConsola
     * @param mensaje String con el mensaje que se desea imprimir
     * @return Número leìdo por consola
     */
    public int leerNum(String mensaje) {
        System.out.println(mensaje);
        int dato = 0;
        dato = leer.nextInt();
        return dato;
    }
}
