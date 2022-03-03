package co.edu.unbosque.model;

public class ManejoArreglos {

    private int[] arreglo;

    public ManejoArreglos() {

    }

    public void generarArreglo(int cantDatos, int caso){
        arreglo = new int[cantDatos];
        if(caso==1){
            for (int i = 0; i < cantDatos; i++) {
                arreglo[i]=i+1;
            }
        }else if(caso==2){
            for (int i = 0; i < cantDatos; i++) {
                arreglo[i]=(int) (Math.random()*cantDatos);
            }
        }else if(caso==3){
            for (int i = 0; i < cantDatos; i++) {
                arreglo[i]=cantDatos-i;
            }
        }
    }

    public int[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }
}
