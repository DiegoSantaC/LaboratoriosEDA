
package com.mycompany.Laboratorio4.EjerciciosPropuestos.EjercicioP6;

public class main {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> lista = new DoublyLinkedList<>();
        lista.addFirst(1);
        lista.addFirst(2);
        lista.addFirst(3);
        lista.addFirst(4);
        lista.addFirst(5);
        lista.addFirst(6);
        lista.printList();
        
        lista.removeLast();     
        lista.printList();
        lista.removeLast();
        lista.printList();
        lista.removeLast();
        lista.printList();
        
        System.out.println("El tamanio de mi lista es: " + lista.size());
        
        lista.deleteAtPosition(1);
        lista.printList();


    }   
}
