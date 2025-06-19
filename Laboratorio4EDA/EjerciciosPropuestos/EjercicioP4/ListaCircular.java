
package Laboratorio4EDA.EjerciciosPropuestos.EjercicioP4;
import java.util.LinkedList;

public class ListaCircular {

    public static void main(String[] args) {
        LinkedList<Integer> listaCircular = new LinkedList<>();

        for (int i = 1; i <= 12; i++) {
            listaCircular.add(i);
        }

        System.out.println("Lista circular (simulada):");
        // Dando 2 vueltas por mi lista
        for(int i=1 ;i <=5 ; i++){
            System.out.println("Vuelta "+ i + ": ");
            for (Integer e: listaCircular) {
                System.out.print(e % (listaCircular.size()+1) + " ");
            }
            System.out.println();
        }    
    }  
}
