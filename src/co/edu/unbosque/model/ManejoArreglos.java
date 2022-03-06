package co.edu.unbosque.model;
/**
 * Clase ManejoArreglos, consta del método constructor, de un método generarArreglo y Getters/Setters
 * Generar arreglos según las condiciones dadas
 * @author David Real
 * @author Yilber Rojas
 */
public class ManejoArreglos {
    /**
     * Arreglo con objetos de tipo long
     */
    private long[] arreglo;

    /**
     * Método constructor de la clase ManejoArreglos
     */
    public ManejoArreglos() {}

    /**
     * Método generarArreglo de la clase ManejoArreglos
     * @param cantDatos Int con la cantidad de datos del arreglo a generar
     * @param caso Int con el caso que indica el orden de los elementos del arreglo
     */
    public void generarArreglo(int cantDatos, int caso){
        arreglo = new long[cantDatos];
        if(caso==1){
            for (int i = 0; i < cantDatos; i++) {
                arreglo[i]=cantDatos-i;
            }
        }else if(caso==2){
            for (int i = 0; i < cantDatos; i++) {
                arreglo[i]=(int) (Math.random()*cantDatos);
            }
        }else if(caso==3){

            for (int i = 0; i < cantDatos; i++) {
                arreglo[i]=i+1;
            }
        }
    }
    //Getters-Setters
    public long[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(long[] arreglo) {
        this.arreglo = arreglo;
    }
}
