
package com.mycompany.laboratorio3eda.Ejercicio1;

public class Lista<T> {
    Node<T> root;
    
    public Lista() {
        this.root = null;
    }

    public void insertarPrimero(T data) {
        Node<T> nodoAuxiliar = new Node<>(data);
        nodoAuxiliar.setNextNode(root);
        root=nodoAuxiliar;
    }
}

