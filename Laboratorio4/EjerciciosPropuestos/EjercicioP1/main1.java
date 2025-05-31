
package com.mycompany.Laboratorio4.EjerciciosPropuestos.EjercicioP1;

public class main1 {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> list=new DoublyLinkedList<>();
        for(int i=1 ; i<=10 ; i++)
            list.insertLast(i);
        System.out.println(list);
    }
    
}
