package co.edu.unbosque.model;
/**
 * Clase QuickSort, consta del método constructor y de un método ordenar
 * Implementación del Algortimo Shell
 * @author David Real
 * @author Yilber Rojas
 */
public class QuickSort {
    /**
     * Método Constuctor de la clase QuickSort
     */
    public QuickSort() {}

    /**
     * Método ordenar de la clase QuickSort
     * @param arreglo Array con objetos de tipo long
     * @param izq Inicio del arreglo
     * @param der Fin del arreglo
     */
    public void ordenar(long[] arreglo, int izq, int der){
        long mitad = arreglo[(izq+der)/2];
        long aux;
        int inf=izq;
        int sup=der;
        do{
            while(arreglo[inf]>mitad && inf<der)
                inf++;
            while(arreglo[sup]<mitad && sup>izq)
                sup--;
            if(inf<=sup){
                aux=arreglo[inf];
                arreglo[inf]=arreglo[sup];
                arreglo[sup]=aux;
                inf++;
                sup--;
            }
        }
        while(inf<=sup);
        if(izq<sup)
            ordenar(arreglo,izq,sup);
        if(inf<der)
            ordenar(arreglo,inf,der);
    }
}
