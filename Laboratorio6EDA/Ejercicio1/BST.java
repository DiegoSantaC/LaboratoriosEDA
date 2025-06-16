
package com.mycompany.Laboratorio6EDA.Ejercicio1;

public class BST<E extends Comparable<E>> {
    protected Node<E> root;
    protected int count;
    
    public BST(){
        this.root=null;
        this.count=0;
    }
    public BST(Node<E> node){
        this.root=node;
        this.count=1;
    }
    
    public void insert(E x) throws ItemDuplicated{
        this.root=insertRecursivo(x, root);
    }
    
    public Node<E> insertRecursivo(E x, Node<E> actual) throws ItemDuplicated{
        Node<E> res=actual;
        if(actual==null)
            res=new Node<E>(x);
        else{
            int valor=x.compareTo(actual.getData());
            if(valor<0)
                actual.setLeft(insertRecursivo(x, actual.getLeft()));
            else if(valor==0)
                throw new ItemDuplicated(x+", ya se encuentra en el arbol");
            else
                actual.setRight(insertRecursivo(x, actual.getRight()));               
        }
        return res;
    }
    
    public void inOrden(){
        if(isEmpty())
            System.out.print("Mi BST esta vacio...");
        else
            System.out.println("Inorden: "+inOrden(root));
    }
    
    private String inOrden(Node<E> actual){
        String str="";
        if(actual.getLeft()!=null)
            str+=inOrden(actual.getLeft());
        str+=actual.getData()+ " ";
        if(actual.getRight()!=null)
            str+=inOrden(actual.getRight());
        return str;
    }
    
    
    public boolean isEmpty(){
        return root==null;
    }
}
