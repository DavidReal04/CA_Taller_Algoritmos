package co.edu.unbosque.model;

public class ManejoArreglos {

    private long[] arreglo;

    public ManejoArreglos() {

    }

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

    public long[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(long[] arreglo) {
        this.arreglo = arreglo;
    }
}
