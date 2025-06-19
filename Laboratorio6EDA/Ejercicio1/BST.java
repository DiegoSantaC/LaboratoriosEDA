
package Laboratorio6EDA.Ejercicio1;

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
        if(actual==null)
            return new Node<>(x);
        else{
            int valor=x.compareTo(actual.getData());
            if(valor<0)
                actual.setLeft(insertRecursivo(x, actual.getLeft()));
            else if(valor==0)
                throw new ItemDuplicated(x+", ya se encuentra en el arbol");
            else
                actual.setRight(insertRecursivo(x, actual.getRight()));               
        }
        return actual;
    }
    
    public void remove(E x) throws ItemNotFound{
        if(isEmpty())
            System.out.println("Mi BST esta vacio...");
        else
            this.root = removeRecursivo(x, root);
    }
    
    public Node<E> removeRecursivo(E x, Node<E> actual) throws ItemNotFound{
        if(actual==null)
            throw new ItemNotFound(x + ", no se encontro en el arbol");
        else{
            int valor=x.compareTo(actual.getData());
            if(valor<0)
                actual.setLeft(removeRecursivo(x, actual.getLeft()));
            else if(valor>0)
                actual.setRight(removeRecursivo(x, actual.getRight()));
            else{
                if(actual.getLeft()!=null && actual.getRight()!= null){
                    actual.setData(sucesor(actual));
                    actual.setRight(minRemove(actual.getRight()));
                } else 
                    actual= (actual.getLeft()!=null) ? actual.getLeft() : actual.getRight();
            }               
        } return actual;
    }
    
    private Node<E> minRemove(Node<E> actual){
        if(actual.getLeft() == null)
            actual=actual.getRight();
        else
            actual.setLeft(minRemove(actual.getLeft()));
        return actual;
    }
    
    public E search(E x) throws ItemNotFound {
        if(isEmpty())
            throw new ItemNotFound(x + ", no se encuentra en el arbol");
        else
            return searchRecursivo(x, root).getData();
    }
    
    public Node<E> searchRecursivo(E x, Node<E> actual) throws ItemNotFound {
        if(actual==null)
            throw new ItemNotFound(x + ", no se encuentra en el arbol");
        else{
            int valor = x.compareTo(actual.getData());
            if(valor < 0)
                return searchRecursivo(x, actual.getLeft());
            else if(valor > 0)
                return searchRecursivo(x, actual.getRight());
            else
                return actual;
        }
    }
       
    public void inOrden(){
        if(isEmpty())
            System.out.println("Mi BST esta vacio...");
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
            System.out.println("Mi BST esta vacio...");
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
            System.out.println("Mi BST esta vacio...");
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
    
    public E sucesor(Node<E> node){
        return min(node.getRight()).getData();
    }
    
    public void destroy(){
        if(isEmpty())
            System.out.println("El arbol ya se encuentra vacio");
        else
            this.root = destroy(root);
    }
    
    private Node<E> destroy(Node<E> node){
        if(node.getLeft()!=null)
            node.setLeft(destroy(node.getLeft()));
        if(node.getRight()!=null)
            node.setRight(destroy(node.getRight()));
        node=null;
        return node;
    }
}
