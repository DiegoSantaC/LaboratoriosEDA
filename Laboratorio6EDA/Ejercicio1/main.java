
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
        System.out.println("El sucesor de mi raiz es: "+tree.sucesor());
        System.out.println("El predecesor de mi raiz es: "+tree.predecesor());
        tree.remove(22);
        tree.remove(1);
        tree.inOrden(); 
        System.out.println("Mi valor minimo es: "+tree.min());
        System.out.println("Mi valor maximo es: "+tree.max());
        System.out.println("15? :" + tree.search(15));
        tree.destroy();
        tree.inOrden();
        tree.insert(1);
        tree.inOrden();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
