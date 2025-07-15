
package Laboratorio9EDA.EjerciciosPropuestos;

import java.util.Scanner;

public class TestHashOpened{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashOpened<String> hash = new HashOpened<>(10);

        int op;
        do {
            System.out.println("\n--- MENÚ HASH ABIERTO ---");
            System.out.println("1. Insertar");
            System.out.println("2. Buscar");
            System.out.println("3. Eliminar");
            System.out.println("4. Mostrar tabla");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            op = sc.nextInt();
            sc.nextLine();

            int key;
            String value;
            switch (op) {
                case 1:
                    System.out.print("Clave (int): ");
                    key = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Valor (String): ");
                    value = sc.nextLine();
                    hash.insert(new Register<>(key, value));
                    break;
                case 2:
                    System.out.print("Clave a buscar: ");
                    key = sc.nextInt();
                    Register<String> encontrado = hash.search(key);
                    System.out.println(encontrado != null ? "Encontrado: " + encontrado : "No encontrado.");
                    break;
                case 3:
                    System.out.print("Clave a eliminar: ");
                    key = sc.nextInt();
                    hash.delete(key);
                    break;
                case 4:
                    hash.showTable();
                    break;
                case 0:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (op != 0);

        sc.close();
    }
}

