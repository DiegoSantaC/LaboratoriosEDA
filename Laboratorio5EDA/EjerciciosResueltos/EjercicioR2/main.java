
package Laboratorio5EDA.EjerciciosResueltos.EjercicioR2;

public class main {

    public static void main(String[] args) {
        QueueLinkedList<Integer> cola=new QueueLinkedList<>();
        for(int i=1 ; i<=8 ; i++)
            cola.enqueue(i);
        cola.printList();
        cola.dequeue();
        cola.dequeue();
        cola.printList();
    }
    
}
