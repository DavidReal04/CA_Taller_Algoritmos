package co.edu.unbosque.model;

public class Shell {
    public Shell(){
    }

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
