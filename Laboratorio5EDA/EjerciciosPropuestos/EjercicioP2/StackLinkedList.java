
package com.mycompany.Laboratorio5EDA.EjerciciosPropuestos.EjercicioP2;

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
        
        public void pop() throws ExceptionIsEmpty{
            if (count == 1) {
                tope=null;
                count--;
                }else if(!isEmpty()){
                    tope=tope.getNext();
                    count--;
                } else 
                    throw new ExceptionIsEmpty("La Stack esta vacia...");
        }
      
        public E top() throws ExceptionIsEmpty{
            if(!isEmpty()){
                E data=tope.getData();
                return data;
            }else 
                throw new ExceptionIsEmpty("La Stack esta vacia...");
        }
        
        public void destroyStack() throws ExceptionIsEmpty{
                if(!isEmpty()){                 
                    while(tope!=null){
                        Node<E> aux = this.tope;
                        tope=tope.getNext();
                        aux.setNext(null);
                    }
                } else 
                    throw new ExceptionIsEmpty("La Stack ya estaba vacia...");
        }
        
        //Como estamos implementando la stack como una lista enlazada casi siempre esta llena
        public boolean isFull(){
            if(isEmpty())
                return false;
            return true;
        }
        
        public void printStack(){
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
