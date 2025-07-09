
package Laboratorio8EDA.EjerciciosPropuestos.ArbolB;
import java.util.*;

public class main {

    public static void main(String[] args) {
         BTree<Integer> arbol=new BTree<Integer>(4);    
         arbol.insert(100);
         arbol.insert(200);
         arbol.insert(300);
         arbol.insert(400);
         arbol.insert(500);
         arbol.insert(50);
         arbol.insert(25);
         arbol.insert(350);
         arbol.insert(375);
         arbol.insert(360);
         arbol.insert(355);
         arbol.insert(150);

         System.out.print(arbol);
    }
    
}
