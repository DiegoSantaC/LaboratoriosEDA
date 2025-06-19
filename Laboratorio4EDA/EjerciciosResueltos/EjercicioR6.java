
package Laboratorio4EDA.EjerciciosResueltos;
import java.util.*;

public class EjercicioR6 {

    public static void main(String[] args) {
        // Creando el objeto de la
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");
        System.out.println(ll);
        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }   
}
