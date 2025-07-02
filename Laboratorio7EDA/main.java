
package Laboratorio7EDA;
import java.util.*;

public class main {

    public static void main(String[] args) {
         AVL<Integer> arbol = new AVL<>();
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n========= MENU AVL =========");
            System.out.println("1. Insertar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Buscar elemento");
            System.out.println("4. Mostrar altura del arbol");
            System.out.println("5. Mostrar recorrido inorden");
            System.out.println("6. Mostrar recorrido preorden");
            System.out.println("7. Mostrar recorrido postorden");
            System.out.println("8. Mostrar minimo");
            System.out.println("9. Mostrar maximo");
            System.out.println("10. Destruir arbol");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el numero a insertar: ");
                    int numInsertar = sc.nextInt();
                    try {
                        arbol.insert(numInsertar);
                        System.out.println("Elemento insertado correctamente.");
                    } catch (ItemDuplicated e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el numero a eliminar: ");
                    int numEliminar = sc.nextInt();
                    try {
                        arbol.remove(numEliminar);
                        System.out.println("Elemento eliminado correctamente.");
                    } catch (ItemNotFound e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el numero a buscar: ");
                    int numBuscar = sc.nextInt();
                    try {
                        Integer encontrado = arbol.search(numBuscar);
                        System.out.println("Elemento encontrado: " + encontrado);
                    } catch (ItemNotFound e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    arbol.altura();
                    break;
                case 5:
                    arbol.inOrden();
                    break;
                case 6:
                    arbol.preOrden();
                    break;
                case 7:
                    arbol.postOrden();
                    break;
                case 8:
                    if (!arbol.isEmpty()) {
                        System.out.println("Minimo: " + arbol.min());
                    } else {
                        System.out.println("Arbol vacio.");
                    }
                    break;
                case 9:
                    if (!arbol.isEmpty()) {
                        System.out.println("Maximo: " + arbol.max());
                    } else {
                        System.out.println("Arbol vacio.");
                    }
                    break;
                case 10:
                    arbol.destroy();
                    System.out.println("Arbol destruido.");
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción invalida. Intente otra vez.");
            }
        } while (opcion != 0);
        
        sc.close();
    }
}
    

