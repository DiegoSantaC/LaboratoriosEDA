
package com.mycompany.Laboratorio5EDA.EjerciciosPropuestos.EjercicioP1;

public class main {

    public static void main(String[] args) {
        StackLinkedList<Integer> pila=new StackLinkedList<>();
        for(int i=1 ; i<=10 ; i++)
            pila.push(i);
        pila.printList();
        pila.pop();
        pila.printList();
    }
    
}
