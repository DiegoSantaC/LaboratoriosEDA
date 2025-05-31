
package com.mycompany.Laboratorio4.EjerciciosPropuestos.EjercicioP2;

public class main2 {

    public static void main(String[] args) {
        CircularLinkedList<Integer> list= new CircularLinkedList<>();
        for(int i=1 ; i <= 10; i++)
            list.insert(i);
        System.out.println(list);
    }   
}
