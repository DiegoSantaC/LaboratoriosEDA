
package Laboratorio5EDA.EjerciciosResueltos.EjercicioR1;

public class main {

    public static void main(String[] args) {
        StackLinkedList<Integer> pila=new StackLinkedList<>();
        for(int i=1 ; i<=8 ; i++)
            pila.push(i);
        pila.printList();
        pila.pop();
        pila.pop();
        pila.pop();      
        pila.printList();
    }
    
}
