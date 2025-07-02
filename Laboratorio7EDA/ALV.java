
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
    
}
