package co.edu.unbosque.model;

public class Radix {

    public Radix(){}

    public void ordenar(long[] arreglo, int tam) {
        int i;
        int m=0;
        int exp=1;
        int[] b = new int[tam];
        for (i=0; i<tam; i++){
            if (arreglo[i]>m){
                m = (int) arreglo[i];
            }
        }
        while (m/exp>0){
            int[] bucket = new int[10];
            for (i=0; i<tam; i++)
                bucket[(int) (9-arreglo[i]/exp%10)]++;
            for (i=1; i<10; i++)
                bucket[i]+=bucket[i-1];
            for (i=tam-1; i>=0; i--)
                b[--bucket[(int) (9-arreglo[i]/exp%10)]] = (int) arreglo[i];
            for (i=0; i<tam;i++){
                arreglo[i]=b[i];
            }
            exp*=10;
        }
    }
}
