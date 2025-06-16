
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
    
    public void preOrden(){
        if(isEmpty())
            System.out.print("Mi BST esta vacio...");
        else
            System.out.println("Preorden: "+preOrden(root));
    }
    
    private String preOrden(Node<E> actual){
        String str="";
        str+=actual.getData()+ " ";
        if(actual.getLeft()!=null)
            str+=preOrden(actual.getLeft());
        if(actual.getRight()!=null)
            str+=preOrden(actual.getRight());
        return str;
    }
    
    public void postOrden(){
        if(isEmpty())
            System.out.print("Mi BST esta vacio...");
        else
            System.out.println("Postorden: "+postOrden(root));
    }
    
    private String postOrden(Node<E> actual){
        String str="";
        if(actual.getLeft()!=null)
            str+=postOrden(actual.getLeft());
        if(actual.getRight()!=null)
            str+=postOrden(actual.getRight());
        str+=actual.getData()+ " ";
        return str;
    }
   
    public boolean isEmpty(){
        return root==null;
    }
    
    public E min(){
        return min(root).getData();
    }
    
    private Node<E> min(Node<E> actual){
        if(actual.getLeft()==null)
            return actual;
        else
            return min(actual.getLeft());
    }
    public E max(){
        return max(root).getData();
    }
    
    private Node<E> max(Node<E> actual){
        if(actual.getRight()==null)
            return actual;
        else
            return max(actual.getRight());
    }
    
    public E sucesor(){
        return min(root.getRight()).getData();
    }
    
    public E predecesor(){
        return max(root.getLeft()).getData();
    }

}
