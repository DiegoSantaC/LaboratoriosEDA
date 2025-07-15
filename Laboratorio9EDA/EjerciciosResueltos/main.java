
package Laboratorio9EDA.EjerciciosResueltos;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashOpened<String> hash = new HashOpened<>(10);

        int opcion;
        do {
            System.out.println("\n--- MENÚ HASH ABIERTO ---");
            System.out.println("1. Insertar");
            System.out.println("2. Buscar");
            System.out.println("3. Eliminar");
            System.out.println("4. Mostrar tabla");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese clave (int): ");
                    int clave = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese valor (String): ");
                    String valor = sc.nextLine();
                    Register<String> reg = new Register<>(clave, valor);
                    hash.insert(reg);
                    break;

                case 2:
                    System.out.print("Ingrese clave a buscar: ");
                    int claveBuscar = sc.nextInt();
                    Register<String> encontrado = hash.search(claveBuscar);
                    if (encontrado != null) {
                        System.out.println("Encontrado: " + encontrado);
                    } else {
                        System.out.println("No se encontró la clave.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese clave a eliminar: ");
                    int claveEliminar = sc.nextInt();
                    hash.delete(claveEliminar);
                    break;

                case 4:
                    hash.showTable();
                    break;

                case 0:
                    System.out.println("¡Programa finalizado!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
    

