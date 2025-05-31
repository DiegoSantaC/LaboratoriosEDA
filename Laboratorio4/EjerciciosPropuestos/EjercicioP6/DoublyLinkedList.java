
package com.mycompany.Laboratorio4.EjerciciosPropuestos.EjercicioP6;

public class DoublyLinkedList<T> {
    Node<T> head;
    Node<T> tail;
    int count;
    
    
    public DoublyLinkedList() {
        this.head = null;
        this.tail=null;
        this.count=0;
    }
    
    public boolean isEmpty() {
	return this.count == 0;
    }
    
    public void addFirst(T x) {
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
    
    public void addLast(T x) {
        if(isEmpty())
            addFirst(x);
        else{
            Node<T> nuevoNodo=new Node<>(x, null ,this.tail);
            tail.setNext(nuevoNodo);
            tail=nuevoNodo;
            this.count ++;
        }
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
                    removeFirts();
                } else if (i == count - 1) {
                    removeLast();
                } else {
                    Node<T> aux;
                    int index;

                    if (i < count / 2) {
                        aux = head;
                        index = 0;
                        while (index < i) {
                            aux = aux.getNext();
                            index++;
                        }
                    } else {
                        aux = tail;
                        index = count - 1;
                        while (index > i) {
                            aux = aux.getPrevius();
                            index--;
                        }
                    }

                    aux.getPrevius().setNext(aux.getNext());
                    aux.getNext().setPrevius(aux.getPrevius());
                    count--;
                }
            }
        } else {
            System.out.println("La lista está vacía, no se puede eliminar.");
        }
    }

    public void removeFirts(){
        if (count == 1) {
            head=null;
            tail=null;
            count --;
            }else if(!isEmpty()){
                head=head.getNext();
                count--;
            }else
                System.out.println("La lista esta vacia, no se puede eliminar el primer elemento");
    }

    public void removeLast() {
        if (count == 1){ 
            head=null;
            tail=null;
            count --;
        }else if (!isEmpty()){
            tail = tail.getPrevius();
            tail.setNext(null);
            count --;
            }else 
                System.out.println("La lista esta vacia, no se puede eliminar el ultimo elemento");
    }  
    
    public int size() {
        return this.count;
    }
    
    public void printList(){
        System.out.println("Mi lista doblemente enlazada es: "+ toString());
    }
    
    @Override
    public String toString() {
        String str = "";
        for(Node<T> aux = this.head; aux != null; aux = aux.getNext())
                str += aux.toString() + ", ";
        return str;
    }
}
