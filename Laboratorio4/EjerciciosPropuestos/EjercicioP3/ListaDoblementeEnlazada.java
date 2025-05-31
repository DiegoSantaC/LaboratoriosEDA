
package com.mycompany.Laboratorio4.EjerciciosPropuestos.EjercicioP3;
import java.util.LinkedList;

public class ListaDoblementeEnlazada {

    public static void main(String[] args) {
         LinkedList<Integer> listaDoble = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            listaDoble.add(i);
        }
        System.out.println("Lista doblemente enlazada: " + listaDoble);
        
        listaDoble.addFirst(0);
        listaDoble.addLast(11);
        System.out.println("Despues de addFirst(0) y addLast(11): " + listaDoble);

        listaDoble.removeFirst();
        listaDoble.removeLast();
        System.out.println("Despues de removeFirst() y removeLast(): " + listaDoble);

        System.out.println("Primer elemento: " + listaDoble.getFirst());
        System.out.println("Ultimo elemento: " + listaDoble.getLast());
    }   
}
