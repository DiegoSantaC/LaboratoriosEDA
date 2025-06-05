
package com.mycompany.Laboratorio5EDA.EjerciciosResueltos.EjercicioR1;

public class StackLinkedList<E> {
    private Node<E> tope;
        private int count;

        public StackLinkedList(){
            this.tope=null;
            this.count=0;
        }

        public void push(E x) {
            if (isEmpty()) {
                this.tope = new Node(x, this.tope);
                this.count ++;
            } else {
                Node<E> aux = this.tope;
                while (aux.getNext() != null)
                        aux = aux.getNext();
                if(!aux.getData().equals(x)) {
                        aux.setNext(new Node(x));
                        this.count ++;
                }
            }
        }
        public void pop(){
            if (count == 1) {
                tope=null;
                count--;
                }else if(!isEmpty()){
                    tope=tope.getNext();
                    count--;
                } else 
                    System.out.print("La pila esta vacia, no se puedes eliminar tope");
        }

        public void printList(){
        System.out.println("Mi lista stack es: "+ toString());
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
