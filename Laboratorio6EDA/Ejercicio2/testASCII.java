
package com.mycompany.Laboratorio6EDA.Ejercicio2;
import com.mycompany.Laboratorio6EDA.Ejercicio1.BST;
import java.util.*;

public class testASCII {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BST<Character> tree = new BST<>();
        System.out.print("Ingrese la palabra para crear el arbol BST: ");
        String palabra=sc.nextLine();
        
        for(int i=0; i<palabra.length() ; i++){
            try{
            tree.insert(palabra.charAt(i));
            } catch (Exception e){
                System.out.println("Letra repetida ignorada: "+palabra.charAt(i));
            }
        }
        tree.inOrden();
        tree.preOrden();
        tree.postOrden();     
    }  
}
