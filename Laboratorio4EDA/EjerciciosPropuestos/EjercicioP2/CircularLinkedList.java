
package Laboratorio4EDA.EjerciciosPropuestos.EjercicioP2;

public class CircularLinkedList<T> {
    Node<T> head;
    int count;
    
    public boolean isEmpty() {
        return this.head == null;
    }
    
    public void insertLeft(T x) {
        Node<T> nuevoNodo = new Node<T>(x, this.head);
        if (isEmpty()){
            this.head = nuevoNodo;
            this.head.setNext(head);
        } else {
            Node<T> aux = this.head;
            while (aux.getNext() != head)
                aux = aux.getNext();
            this.head=nuevoNodo;
            aux.setNext(head);
        }
        this.count ++;
    }
    
    public void insertRight(T x) {
        Node<T> nuevoNodo = new Node<T>(x, this.head);
        if (isEmpty()){
            this.head = nuevoNodo;
            this.head.setNext(head);
        } else {
            Node<T> aux = this.head;
            while (aux.getNext() != head)
                aux = aux.getNext();
            aux.setNext(nuevoNodo);
        }
        this.count ++;
    }
    
    public String toString() {
        String str = "";
        Node<T> aux = this.head;
        while(aux.getNext()!=head){
            str += aux.toString() + ", ";
            aux=aux.getNext();
        }    
        str+=aux.toString();
        return str;
    }
}

