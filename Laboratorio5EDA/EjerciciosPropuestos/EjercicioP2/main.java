
package com.mycompany.Laboratorio5EDA.EjerciciosPropuestos.EjercicioP2;

public class main {

    public static void main(String[] args) {
        StackLinkedList<Integer> pila=new StackLinkedList<>();
        try{
            
        for(int i=1 ; i<=10 ; i++)
            pila.push(i);
        pila.printList();
        pila.destroyStack();
        pila.printList();
        pila.destroyStack();
                
        }catch(ExceptionIsEmpty e){
            System.out.println(e.getMessage());
        }
    } 
}
    

