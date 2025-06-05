
package com.mycompany.Laboratorio5EDA.EjerciciosPropuestos.EjercicioP3;

public class main {

    public static void main(String[] args) {
        QueueLinkedList<Integer> cola=new QueueLinkedList<>();
        try{
        for(int i=1 ; i<=12 ; i++)
            cola.enqueue(i);
        cola.dequeue();
        cola.dequeue();
        cola.printQueue();
        } catch(ExceptionIsEmpty e){
            System.out.println(e.getMessage());
        }
    }
    
}
