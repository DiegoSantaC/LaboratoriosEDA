
package Laboratorio4EDA.EjerciciosPropuestos.EjercicioP5;
import java.util.*;

public class main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();
        int opcion = 0;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Eliminar por clave");
            System.out.println("4. Eliminar primero");
            System.out.println("5. Eliminar ultimo");
            System.out.println("6. Mostrar lista");
            System.out.println("7. Tamanio de la lista");
            System.out.println("8. BuscarElemento");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();

            if(opcion != 0) {
                ejecutarOperacion(list, opcion);
            }

        } while (opcion != 0);     
    }
    
    public static <T> void ejecutarOperacion(LinkedList<T> list, int opcion) {
        Scanner sc=new Scanner(System.in);
        switch (opcion) {
            case 1: // Insertar al inicio
                System.out.print("Ingrese el elemento a insertar al inicio: ");
                T elemInicio = (T) sc.nextLine(); // Cast para genéricos (con advertencia)
                list.addFirst(elemInicio);
                System.out.println("Elemento agregado al inicio.");
                break;

            case 2: // Insertar al final
                System.out.print("Ingrese el elemento a insertar al final: ");
                T elemFinal = (T) sc.nextLine();
                list.addLast(elemFinal);
                System.out.println("Elemento agregado al final.");
                break;

            case 3: // Eliminar por clave
                System.out.print("Ingrese el elemento a eliminar: ");
                T elemEliminar = (T) sc.nextLine();
                list.deleteByKey(elemEliminar);
                break;

            case 4: // Eliminar primero
                list.removeFirts();
                System.out.println("Primer elemento eliminado.");
                break;

            case 5: // Eliminar último
                list.removeLast();
                System.out.println("Ultimo elemento eliminado.");
                break;

            case 6: // Mostrar lista
                list.printList();
                break;

            case 7: // Tamaño lista
                System.out.println("Tamanio de la lista: " + list.size());
                break;
                
            case 8: // Buscar elemento
                System.out.print("Ingrese el elemento que sea buscar: ");
                T elemBuscado = (T) sc.nextLine();
                System.out.println("El indice del elemento es: " + list.search(elemBuscado));
                break;    

            default:
                System.out.println("Opcion invalida.");
                break;
        }
    }
}
