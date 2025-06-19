
package Laboratorio4EDA.EjerciciosPropuestos.EjercicioP1;

public class DoublyLinkedList<T> {
    Node<T> head;
    Node<T> tail;
    int count;
    
    
    public DoublyLinkedList() {
        this.head = null;
        this.tail=null;
        int count=0;
    }
    
    public boolean isEmpty() {
	return this.count == 0;
    }
    
    public void insertFirst(T x) {
        if(!isEmpty()){
            Node<T> nuevoNodo=new Node<>(x, this.head, null);
            head.setPrevius(nuevoNodo);
            head=nuevoNodo;
        }
        else{
            Node<T> nuevoNodo=new Node<>(x, null , null);
            head=nuevoNodo;
            tail=head;
        }
        this.count ++;
    }
    
    public void insertLast(T x) {
        if(isEmpty())
            insertFirst(x);
        else{
            Node<T> nuevoNodo=new Node<>(x, null ,this.tail);
            tail.setNext(nuevoNodo);
            tail=nuevoNodo;
            this.count ++;
        }
    }
    
    public String toString() {
        String str = "";
        for(Node<T> aux = this.head; aux != null; aux = aux.getNext())
                str += aux.toString() + ", ";
        return str;
    }
}
