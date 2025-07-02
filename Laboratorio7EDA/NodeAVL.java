
package Laboratorio7EDA;

public class NodeAVL<E> {
    NodeAVL<E> left;
    NodeAVL<E> right;
    private int FE;
    private E data;

    public NodeAVL(E data) {
        this.left=null;
        this.right=null;
        this.data=data;
        this.FE=0;
    }
     
    public NodeAVL<E> getLeft() {
        return left;
    }

    public void setLeft(NodeAVL<E> left) {
        this.left = left;
    }
    
    public NodeAVL<E> getRight() {
        return right;
    }

    public void setRight(NodeAVL<E> right) {
        this.right = right;
    }
    
    public int getFE() {
        return FE;
    }

    public void setFE(int FE) {
        this.FE = FE;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
    
    
}
