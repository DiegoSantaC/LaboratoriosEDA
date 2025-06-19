
package Laboratorio5EDA.EjerciciosPropuestos.EjercicioP4;

public class main {

    public static void main(String[] args) {
        QueueLinkedList<Integer> cola=new QueueLinkedList<>();
        try{
        for(int i=1 ; i<=10 ; i++)
            cola.enqueue(i);
        cola.printQueue();
        System.out.println("Mi cola esta llena?: "+cola.isFull());
        System.out.println("Primero es: "+cola.front());
        System.out.println("Ultimo es: "+cola.back());
        cola.destroyQueue();
        cola.printQueue();
        System.out.println("Mi cola esta llena?: "+cola.isFull());
        } catch(ExceptionIsEmpty e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
}
