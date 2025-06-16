
package com.mycompany.Laboratorio6EDA.Ejercicio1;

public class main {

    public static void main(String[] args) {
        BST<Integer> tree=new BST<>();
        try{
        tree.insert(5);
        tree.insert(8);
        tree.insert(13);
        tree.insert(3);
        tree.insert(19);
        tree.insert(1);
        tree.insert(15);
        tree.inOrden();
        } catch(ItemDuplicated e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
