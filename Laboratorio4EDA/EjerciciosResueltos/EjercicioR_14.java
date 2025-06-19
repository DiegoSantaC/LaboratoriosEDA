
package Laboratorio4EDA.EjerciciosResueltos;

import java.util.*;

public class EjercicioR_14 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(12);
        list.add(123);
        
        list.addFirst(0);
        list.addLast(1234);
        for(int e: list){
            System.out.print(e + " ");
        }
    }
    
}
