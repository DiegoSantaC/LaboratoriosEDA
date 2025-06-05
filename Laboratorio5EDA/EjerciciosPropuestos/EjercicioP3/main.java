
package com.mycompany.Laboratorio5EDA.EjerciciosPropuestos.EjercicioP3;

public class main {

    public static void main(String[] args) {
        QueueLinkedList<Integer> cola=new QueueLinkedList<>();
        for(int i=1 ; i<=10 ; i++)
            cola.enqueue(i);
        cola.printQueue();
        cola.dequeue();
        cola.printQueue();
    }
    
}
