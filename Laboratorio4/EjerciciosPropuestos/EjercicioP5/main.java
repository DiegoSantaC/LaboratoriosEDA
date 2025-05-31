
package com.mycompany.Laboratorio4.EjerciciosPropuestos.EjercicioP5;

public class main {

    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.addFirst("Uno");
        list.addFirst("Dos");
        list.addFirst("Tres");
        list.addLast("Cero");
        list.printList();
        System.out.println("El tamaño de mi lista es: " + list.size());
    }
    
}
