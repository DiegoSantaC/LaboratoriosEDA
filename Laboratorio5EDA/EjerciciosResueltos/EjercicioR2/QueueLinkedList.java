
package Laboratorio5EDA.EjerciciosResueltos.EjercicioR2;

public class QueueLinkedList<E> {
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
        
        public void dequeue(){
            if (count == 1) {
                primero=null;
                ultimo=null;
                count--;
                }else if(!isEmpty()){
                    primero=primero.getNext();
                    count--;
                } else 
                    System.out.print("La cola esta vacia, no se puede desencolar");
        }

        public void printList(){
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

        public boolean isEmpty(){
            return primero==null;
        }
    
}
