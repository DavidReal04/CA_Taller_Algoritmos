package co.edu.unbosque.model;

public class QuickSort {

    public QuickSort() {
    }

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
