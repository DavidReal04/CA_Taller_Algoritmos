package co.edu.unbosque.model;

import java.util.ArrayList;

public class ManejoArreglos {

    private ArrayList<Integer> arreglo;

    public ManejoArreglos() {
         arreglo = new ArrayList<>();
    }

    public void generarArreglo(int cantDatos, int caso){
        arreglo.clear();
        if(caso==1){
            for (int i = 0; i < cantDatos; i++) {
                arreglo.add(i, i);
            }
        }else if(caso==2){
            for (int i = 0; i < cantDatos; i++) {
                arreglo.add((int) (Math.random()*cantDatos));
            }
        }else if(caso==3){
            for (int i = 0; i < cantDatos; i++) {
                arreglo.add(cantDatos-i, i);
            }
        }
    }

    public ArrayList<Integer> getArreglo() {
        return arreglo;
    }

    public void setArreglo(ArrayList<Integer> arreglo) {
        this.arreglo = arreglo;
    }
}
