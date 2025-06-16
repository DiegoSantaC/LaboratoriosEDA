
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
        tree.insert(2);
        tree.insert(22);
        tree.inOrden(); 
        tree.preOrden();
        tree.postOrden();
        System.out.println("Mi valor minimo es: "+tree.min());
        System.out.println("Mi valor maximo es: "+tree.max());
        } catch(ItemDuplicated e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
