
package Laboratorio8EDA.EjerciciosPropuestos.ArbolB;
import java.util.ArrayList;

public class BNode<E> {
    protected ArrayList<E> claves;
    protected ArrayList<BNode<E>> hijos;
    protected int count;
    
    public BNode(int n){
        this.claves = new ArrayList<E>(n);
        this.hijos = new ArrayList<BNode<E>>(n);
        this.count = 0;
        for (int i = 0; i < n ; i++){
            this.claves.add(null);
            this.hijos.add(null);
        }
    }
    
    public boolean nodeFull(int i){
        return claves.get(i)!=null;
    }
    
    // Check if the current node is empty
    public boolean nodeEmpty (){
        return claves.get(0)==null;
    }
    
    public boolean searchNode (E data, int[] pos){
        for(int i=0;i<claves.size();i++){
            if(data.equals(claves.get(i))){
                pos[0]=i;
                return true;
            }              
        } return false;
    }
    // Return the keys found in the node.
    @Override
    public String toString(){
        String s="";
        for(E clave : claves){
            if(clave!=null)
                s+=clave;
        }
        return s;
    }
}
