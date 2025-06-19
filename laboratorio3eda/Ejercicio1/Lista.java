package Laboratorio3EDA.Ejercicio1;

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
    
    public String toString() {
        String str="";
        for(Node<T> i=root; i!= null ; i=i.getNextNode()){
            str+=i.toString()+ ",";
        }
        return str;
    }
}

