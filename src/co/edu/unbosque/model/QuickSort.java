package co.edu.unbosque.model;

public class QuickSort {

    public QuickSort() {
    }

    public void ordenar(long[] arreglo, int izq, int der){
        while (izq<der){
            int numPivot = pivote(arreglo,izq,der);
            if(numPivot-izq <= der-(numPivot+1)){
                ordenar(arreglo,izq,numPivot);
                izq=numPivot+1;
            }else{
                ordenar(arreglo,numPivot+1,der);
                der=numPivot;
            }
            System.out.println(numPivot);
        }
    }

    public int pivote(long[] arreglo, int izq, int der){
        long pivot = arreglo[izq];
        int izq1=izq-1;
        int der1=der+1;
        while (true){
            while (++izq1<der && arreglo[izq1] < pivot);
            while (--der1>izq && arreglo[der1] > pivot);
            if (izq1<der1){
                long aux = arreglo[izq1];
                arreglo[izq1]=arreglo[der1];
                arreglo[der1]=aux;
            }else{
                return der1;
            }
        }
    }
}
