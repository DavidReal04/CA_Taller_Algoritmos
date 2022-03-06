package co.edu.unbosque.model;

/**
 * Clase Burbuja, consta del método constructor y de un método ordenar
 * Implementación del Algortimo Burbuja
 * @author David Real
 * @author Yilber Rojas
 */
public class Burbuja {
    /**
     * Método constructor de la clase Burbuja
     */
    public Burbuja(){}

    /**
     * Método ordenar de la clase Burbuja
     * @param arreglo Array con objetos de tipo long
     */
    public void ordenar(long[] arreglo){
        long aux;
        for(int i=1;i<(arreglo.length);++i){
            boolean cambiados = false;
            for(int j=0;j<(arreglo.length-1);++j){
                if(arreglo[j]<arreglo[j+1]){
                    aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                    cambiados=true;
                }
            }
            if(!cambiados){
                break;
            }
        }
    }

}
