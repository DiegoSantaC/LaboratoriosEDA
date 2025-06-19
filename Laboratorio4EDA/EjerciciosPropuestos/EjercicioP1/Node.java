package Laboratorio4EDA.EjerciciosPropuestos.EjercicioP1;

public class Node<E> {
    private E data;
    private Node<E> next;
    private Node<E> previus;

    public Node(E data, Node<E> next, Node<E> previus) {
            this.data = data;
            this.next = next;
            this.previus=previus;
    }
    public Node(E data) {
            this(data, null, null);
    }
    public E getData() {
            return this.data;
    }
    public void setData(E data) {
            this.data = data;
    }
    public Node<E> getNext() {
            return this.next;
    }
    public void setNext(Node<E> next) {
            this.next = next;
    }

    public Node<E> getPrevius() {
        return previus;
    }

    public void setPrevius(Node<E> previus) {
        this.previus = previus;
    }      
    public String toString() {
            return this.data.toString();
    }
}
