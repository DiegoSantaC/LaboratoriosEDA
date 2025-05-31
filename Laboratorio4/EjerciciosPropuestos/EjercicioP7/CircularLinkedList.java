
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
    
    public void deleteByKey(T e){
        if(!isEmpty()){
            if(head.getData().equals(e)){
                head=head.getNext();
            }else{
                Node<T> prev=head;
                Node<T> aux=prev.getNext();
                while (aux != null && !aux.getData().equals(e)){
                    prev=aux;
                    aux=aux.getNext();
                }
                if(aux != null)
                    prev.setNext(aux.getNext());
                else
                   System.out.println("No se encontro este elemento en la lista");
            } count --;
        } else 
            System.out.println("La lista esta vacia");
    }

    public void deleteAtPosition(int i) {
        if (!isEmpty()) {
            if (i < 0 || i >= count) {
                System.out.println("Posición inválida.");
            } else {
                if (i == 0) {
                    head=head.getNext();
                } else {
                    Node<T> prev = head;
                    Node<T> aux = head.getNext();
                    int index = 1;
                    while (index < i) {
                        prev = aux;
                        aux = aux.getNext();
                        index++;
                    }
                    prev.setNext(aux.getNext());
                }
            } count --;
        } else {
            System.out.println("La lista está vacía, no se puede eliminar.");
        }
    }

    public void removeFirts(){
        if (count == 1) {
            head=null;
            count--;
            }else if(!isEmpty()){
                Node<T> aux = this.head;
                while (aux.getNext() != head)
                    aux = aux.getNext();
                head=head.getNext();
                aux.setNext(head);
                count--;
            }else
                System.out.println("La lista esta vacia, no se puede eliminar el primer elemento");
    }

    public void removeLast() {
        if (count == 1){
            head=null;
            count --;
        }else if (!isEmpty()){
            Node<T> aux = this.head;
            while (aux.getNext().getNext() != head)
                aux = aux.getNext();
            aux.setNext(head);
            count --;
            }else 
                System.out.println("La lista esta vacia, no se puede eliminar el ultimo elemento");
    }
    
    public int size() {
        return this.count;
    }

    public void printList(){
        System.out.println("Mi lista enlazada es: "+ toString());
    }
    
    public String toString() {
        String str = "";
        if(!isEmpty()){
            Node<T> aux = this.head;
            while(aux.getNext()!= head){
                str += aux.toString() + ", ";
                aux=aux.getNext();
            }    
            str+=aux.toString();       
        } else
            str="La lista esta vacia";
        return str;
    }
}

