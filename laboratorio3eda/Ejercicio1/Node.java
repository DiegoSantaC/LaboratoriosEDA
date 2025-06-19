package Laboratorio3EDA.Ejercicio1;

public class Node<T> {
    T data;
    Node<T> nextNode;
    
    public Node(T data) {
        this.data = data;
        this.nextNode = null;
    }
    public Node(T data, Node<T> nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }   
    public T getData() {
        return data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    @Override
    public String toString() {
        return "" + data.toString();
    }    
}
