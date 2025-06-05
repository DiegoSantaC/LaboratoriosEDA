
package com.mycompany.Laboratorio5EDA.EjerciciosPropuestos.EjercicioP1;

public class StackLinkedList<E> implements Stack<E>{
    private Node<E> tope;
    private int count;

    public StackLinkedList(){
        this.tope=null;
        this.count=0;
    }

    public void push(E x) {
            this.tope = new Node(x, this.tope);
            this.count ++;
    }
        
    public void pop(){
        if (count == 1) {
            tope=null;
            count--;
            }else if(!isEmpty()){
                tope=tope.getNext();
                count--;
            } else 
                System.out.print("La pila esta vacia, no se puede el eliminar tope");
    }

    public void printList(){
    System.out.println("Mi PILA es: "+ toString());
    }
    @Override
    public String toString() {
        String str = "";
        for(Node<E> aux = this.tope; aux != null; aux = aux.getNext())
                str += aux.toString() + ", ";
        return str;
    }
    public boolean isEmpty(){
        return tope==null;
    }
}
