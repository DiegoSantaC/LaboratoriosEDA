
package Laboratorio7EDA;

public class ALV<E extends Comparable<E>> {
    private NodeAVL<E> root;
    private int count;
    
    public ALV(){
        this.root = null;
        count=0;
    }
    public ALV(NodeAVL<E> root){
        this.root = root;
        count=1;
    }
    
    public void altura(){
        System.out.println("La altura de mi arbol es: "+ altura(root));
    }
    
    private int altura(NodeAVL<E> actual){
        if(actual!=null){
            int alturaIzquierda=0;
            int alturaDerecha=0;
            if(actual.getLeft()!=null)
                alturaIzquierda+=altura(actual.getLeft());
            alturaIzquierda++;
            if(actual.getRight()!=null)
                alturaDerecha+=altura(actual.getRight());
            alturaDerecha++;

            return Math.max(alturaIzquierda, alturaDerecha);
        } else
            return 0;
    }
    
    public void insert(E x) throws ItemDuplicated{
        NodeAVL<E> nuevaRoot= (NodeAVL<E>) root;
        this.root = insertarRecursivo(x, nuevaRoot);
        count++;
    }
    
    protected NodeAVL<E> insertarRecursivo(E x, NodeAVL<E> actual) throws ItemDuplicated{
        NodeAVL<E> res=actual;
        if(actual==null)
            res = new NodeAVL<>(x);
        else{
            int valor= actual.getData().compareTo(x);
            if(valor<0)
                actual.setRight(insertarRecursivo(x, actual.getRight()));           
            else if(valor==0)
                throw new ItemDuplicated(x + " ya se encuentra en el arbol");
            else    
                actual.setLeft(insertarRecursivo(x, actual.getLeft()));
            
            res=balancear(actual);               
        }
        return res;
    }
    
    public int calcularFE(NodeAVL<E> node){
        return altura(node.getRight())- altura(node.getLeft());
    }
    
    
    public NodeAVL<E> balancear(NodeAVL<E> node){
        int FE=calcularFE(node);
            if(FE >= 2){
                if(node.getRight().getFE() >= 0){
                    return rotacionSimpleIzquierda(node);
                } else {
                    return rotacionDobleIzquierda(node);
                }
            } else if(FE <=-2){
                if(node.getLeft().getFE() <= 0){
                    return rotacionSimpleDerecha(node);
                } else {
                    return rotacionDobleDerecha(node);
                }
            } else node.setFE(FE); 
        return node;
    }
    
    private NodeAVL<E> rotacionSimpleDerecha(NodeAVL<E> node){
        NodeAVL<E> ref=node.getLeft();
        
        node.setLeft(ref.getRight());
        ref.setRight(node);
        node=ref;
        
        node.setFE(calcularFE(node));
        ref.setFE(calcularFE(ref));
        
        return node;                    
    }
    
    private NodeAVL<E> rotacionSimpleIzquierda(NodeAVL<E> node){
        NodeAVL<E> ref=node.getRight();
        
        node.setRight(ref.getLeft());
        ref.setLeft(node);
        node=ref;
        
        node.setFE(calcularFE(node));
        ref.setFE(calcularFE(ref));
        
        return node;                    
    }
    
    private NodeAVL<E> rotacionDobleDerecha(NodeAVL<E> node){
        NodeAVL<E> nuevoIzquierdo= rotacionSimpleIzquierda(node.getLeft());
        node.setLeft(nuevoIzquierdo);
        
        return rotacionSimpleDerecha(node);
    }
    
    private NodeAVL<E> rotacionDobleIzquierda(NodeAVL<E> node){
        NodeAVL<E> nuevoDerecho= rotacionSimpleDerecha(node.getRight());
        node.setRight(nuevoDerecho);
        
        return rotacionSimpleIzquierda(node);  
    }
    
}
