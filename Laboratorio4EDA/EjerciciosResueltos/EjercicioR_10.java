
package Laboratorio4EDA.EjerciciosResueltos;
import java.util.*;

public class EjercicioR_10 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(123);
        list.add(12);
        list.add(11);
        list.add(1134);
        System.out.println("LinkedList: " + list);
        Object[] a=list.toArray();
        System.out.print("Despues de convertir LinkedList a un Array: ");
        for(Object e : a){
            System.out.print(e + " ");
        }
    } 
}
