
package Laboratorio7EDA;

public class main {

    public static void main(String[] args) {
        AVL<Integer> tree = new AVL<>();
        try{
        tree.insert(15);
        tree.insert(11);
        tree.insert(25);
        tree.insert(8);
        tree.insert(5);
        tree.insert(20);
        tree.insert(10);
        tree.insert(12);
        tree.insert(1);
        tree.insert(29);
        tree.insert(18);
        tree.insert(22);
        tree.insert(27);
        tree.insert(30);
        tree.insert(9);
        tree.insert(23);
        tree.insert(32);
        tree.insert(17);
        tree.insert(19);
        tree.insert(16);
        tree.inOrden();
        tree.altura();
        NodeAVL<Integer> ref =  tree.root;
        System.out.println("El EF de mi arbol es: "+tree.calcularFE(ref));
        tree.remove(25);
        tree.inOrden();
        tree.altura();
        System.out.println("El EF de mi arbol es: "+tree.calcularFE(ref));
        System.out.println("17? : "+tree.search(17));
        } catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
}
