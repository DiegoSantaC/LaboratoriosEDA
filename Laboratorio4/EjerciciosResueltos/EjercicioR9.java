
package com.mycompany.Laboratorio4.EjerciciosResueltos;
import java.util.*;

public class EjercicioR9 {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Uno");
        ll.add("Dos");
        ll.add(1, "Tres");
        // Usando metodo GET en mi for
        for(int i=0;i<ll.size();i++){
            System.out.print(ll.get(i) + " ");
        }
        System.out.println();
        // Usando foreach
        for(String e : ll){
            System.out.print(e + " ");
        }
    }
    
}
