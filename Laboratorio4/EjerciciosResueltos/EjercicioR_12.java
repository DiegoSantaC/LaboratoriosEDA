
package com.mycompany.Laboratorio4.EjerciciosResueltos;

import java.util.*;

public class EjercicioR_12 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(123);
        list.add(12);
        list.add(11);
        list.add(1134);
        //Mostrar la lista
        System.out.println("Incial LinkedList: " + list);
        System.out.println("El primer elemento removido es: " + list.removeFirst());
        System.out.println("Actualizada LinkedList: " + list);

    }
    
}
