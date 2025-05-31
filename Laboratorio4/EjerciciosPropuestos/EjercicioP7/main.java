
package com.mycompany.Laboratorio4.EjerciciosPropuestos.EjercicioP7;

public class main {

    public static void main(String[] args) {
        CircularLinkedList<Integer> lista = new CircularLinkedList<>();
        lista.addFirts(1);
        lista.addFirts(2);
        lista.addFirts(3);
        lista.addFirts(4);
        lista.addFirts(5);
        lista.addFirts(6);
        lista.addLast(0);
        lista.printList();
        
        lista.removeFirts();
        lista.removeLast();
        lista.printList();
        lista.removeFirts();
        lista.removeLast();
        lista.printList();
        lista.removeFirts();
        lista.removeLast();
        lista.printList();
        System.out.println("El tamanio de mi lista circular es: " + lista.size());
        
        lista.removeLast();
        lista.printList();
        lista.removeLast();
    }
    
}
