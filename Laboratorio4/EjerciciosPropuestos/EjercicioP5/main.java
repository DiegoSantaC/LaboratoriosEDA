
package com.mycompany.Laboratorio4.EjerciciosPropuestos.EjercicioP5;

public class main {

    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.addFirst("Uno");
        list.addFirst("Dos");
        list.addFirst("Tres");
        list.addFirst("Cuatro");
        list.addFirst("Cinco");
        list.addFirst("Seis");
        list.printList();
        list.removeFirts();
        list.printList();
        list.removeLast();
        list.printList();
        list.deleteByKey("Dos");
        list.printList();
        list.deleteAtPosition(1);
        list.printList();

        System.out.println("El tamaño de mi lista es: " + list.size());
    }    
}
