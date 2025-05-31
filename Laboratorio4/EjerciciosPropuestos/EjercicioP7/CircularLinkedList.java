
package com.mycompany.Laboratorio4.EjerciciosPropuestos.EjercicioP7;

public class CircularLinkedList<T> {
    Node<T> head;
    int count;
    
    public boolean isEmpty() {
        return this.head == null;
    }
    
    public void addFirts(T x) {
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
    
    public void addLast(T x) {
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
    
    public int size() {
        return this.count;
    }

    public void printList(){
        System.out.println("Mi lista enlazada es: "+ toString());
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

