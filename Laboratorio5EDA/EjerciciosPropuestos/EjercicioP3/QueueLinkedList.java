
package Laboratorio5EDA.EjerciciosPropuestos.EjercicioP3;

public class QueueLinkedList<E> implements Queue<E>{
    private Node<E> primero;
        private Node<E> ultimo;
        private int count;

        public QueueLinkedList(){
            this.primero=null;
            this.ultimo=null;
            this.count=0;
        }
        //Encolar
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
        //Desencolar
        public void dequeue(){
            if (count == 1) {
                primero=null;
                ultimo=null;
                count--;
                }else if(!isEmpty()){
                    primero=primero.getNext();
                    count--;
                } else 
                    System.out.print("La cola esta vacia, no se puede desencolar al ultimo");
        }     
        
        public boolean isEmpty(){
            return primero==null;
        }
        
        public void printQueue(){
            System.out.println("Mi cola es: "+ toString());
        }

        @Override
        public String toString() {
            String str = "";
            for(Node<E> aux = this.primero; aux != null; aux = aux.getNext())
                    str += aux.toString() + ", ";
            return str;
        }
    
}
