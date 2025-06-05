
package com.mycompany.Laboratorio5EDA.EjerciciosPropuestos.EjercicioP3;

public class QueueLinkedList<E> implements Queue<E>{
    private Node<E> primero;
        private Node<E> ultimo;
        private int count;

        public QueueLinkedList(){
            this.primero=null;
            this.ultimo=null;
            this.count=0;
        }

        public void enqueue(E x) {
            Node<E> nuevoNodo = new Node(x, null);
            if (isEmpty()) {
                this.primero=nuevoNodo;
                this.ultimo=nuevoNodo;
                primero.setNext(ultimo);
            } else {
                this.ultimo.setNext(nuevoNodo);
                this.ultimo=nuevoNodo;
            }
            this.count ++;
        }
        
        public void dequeue() throws ExceptionIsEmpty{
            if (count == 1) {
                primero=null;
                ultimo=null;
                count--;
                }else if(!isEmpty()){
                    primero=primero.getNext();
                    count--;
                } else 
                    throw new ExceptionIsEmpty("La Stack esta vacia...");
        }
        
        public void destroyQueue(){
            
        }
        
        public E back() throws ExceptionIsEmpty{
            return null;
        }
        public E front() throws ExceptionIsEmpty{
            return null;
        }

        public boolean isFull(){
            if(isEmpty())
                return false;
            return true;
        }
        
        public boolean isEmpty(){
            return primero==null;
        }
        
        public void printQueue(){
        System.out.println("Mi cola es: "+ toString());
        System.out.println("El primero es: "+ primero.getData());
        System.out.println("El ultimo es: "+ ultimo.getData());
        }

        @Override
        public String toString() {
            String str = "";
            for(Node<E> aux = this.primero; aux != null; aux = aux.getNext())
                    str += aux.toString() + ", ";
            return str;
        }
    
}
