package co.edu.unbosque.model;

public class QuickSort {

    public QuickSort() {
    }

    public void ordenar(long[] arreglo, int izq, int der){
        if(izq<der){
            int numPivot = pivote(arreglo,izq,der);
            ordenar(arreglo,izq,numPivot);
            ordenar(arreglo,numPivot+1,der);
        }
    }

    public int pivote(long[] arreglo, int izq, int der){
        long pivot = arreglo[izq];
        while (true){
            while (arreglo[izq] < pivot){
                izq++;
            }
            while (arreglo[der] > pivot){
                der--;
            }
            if (izq>=der){
                return der;
            }else{
                arreglo[izq]=arreglo[izq]+arreglo[der];
                arreglo[der]=arreglo[izq]-arreglo[der];
                arreglo[izq]=arreglo[izq]-arreglo[der];
                izq++;
                der--;
            }
        }
    }
}
