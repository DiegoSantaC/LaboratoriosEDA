
package Laboratorio4EDA.EjerciciosPropuestos.EjercicioP2;

public class main2 {

    public static void main(String[] args) {
        CircularLinkedList<Integer> list= new CircularLinkedList<>();
        for(int i=1 ; i <= 12; i++)
            list.insertRight(i);
        System.out.println(list);
    }   
}
