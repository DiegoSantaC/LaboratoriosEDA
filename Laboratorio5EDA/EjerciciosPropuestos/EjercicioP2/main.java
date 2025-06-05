
package com.mycompany.Laboratorio5EDA.EjerciciosPropuestos.EjercicioP2;

public class main {

    public static void main(String[] args) {
        StackLinkedList<Integer> pila=new StackLinkedList<>();
        try{
            
        for(int i=1 ; i<=2 ; i++)
            pila.push(i);
        pila.printList();
        pila.pop();
        pila.pop();
        pila.printList();
        System.out.println("El tope de mi lista es: "+pila.top());
        
        }catch(ExceptionIsEmpty e){
            System.out.println(e.getMessage());
        }
    } 
}
    

