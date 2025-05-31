
package com.mycompany.Laboratorio4.EjerciciosResueltos;
import java.util.*;

public class EjercicioR8 {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Uno");
        ll.add("Dos");
        ll.add(1, "Tres");
        System.out.println("Inicial LinkedList " + ll);
        ll.set(1, "Cuatro");
        System.out.println("Actualizada LinkedList " + ll);
    }
}
