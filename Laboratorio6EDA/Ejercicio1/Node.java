
package com.mycompany.Laboratorio6EDA.Ejercicio1;

public class Node<E> {
    protected E data;
    protected Node<E> left;
    protected Node<E> right;
    
    public Node(E data) {
            this.data = data;
            this.left = null;
            this.right = null;
    }

    public Node(E data, Node<E> left, Node<E> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
        
    public E getData() {
            return this.data;
    }
    public void setData(E data) {
            this.data = data;
    }

    public Node<E> getLeft() {
        return left;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }
      
    public String toString() {
            return this.data.toString();
    }
}
