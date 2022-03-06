package co.edu.unbosque.model;

/**
 * Clase Shell, consta del método constructor y de un método ordenar
 * Implementación del Algortimo Shell
 * @author David Real
 * @author Yilber Rojas
 */
public class Shell {
    /**
     * Método Constructor de la clase Shell
     */
    public Shell(){}

    /**
     * Método ordenar de la clase Shell
     * @param arreglo Array con objetos de tipo long
     */
    public void ordenar(long[] arreglo){
        int salto=0 , i=0;
        long temp=0;
        boolean cambio;
        for(salto=arreglo.length/2; salto!=0; salto/=2){
            cambio=true;
            while(cambio){
                cambio=false;
                for(i=salto; i<arreglo.length;i++){
                    if(arreglo[i-salto]<arreglo[i]){
                        temp=arreglo[i];
                        arreglo[i]=arreglo[i-salto];
                        arreglo[i-salto]=temp;
                        cambio=true;
                    }
                }
            }
        }
    }
}
