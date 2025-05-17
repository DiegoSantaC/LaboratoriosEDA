package com.mycompany.Laboratorio1EDA;
import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] arreglo = leerArreglo();
        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);

        ordenarPorInsercion(arreglo);

        System.out.println("Arreglo ordenado:");
        imprimirArreglo(arreglo);
    }

    // Método para leer el arreglo desde consola
    public static int[] leerArreglo() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de elementos: ");
        int tamaño = entrada.nextInt();

        int[] arreglo = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Elemento [" + i + "]: ");
            arreglo[i] = entrada.nextInt();
        }
        return arreglo;
    }

    // Método para imprimir el arreglo
    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método que implementa el ordenamiento por inserción
    public static void ordenarPorInsercion(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            int actual = arreglo[i];
            int j = i - 1;

            while (j >= 0 && arreglo[j] > actual) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }

            arreglo[j + 1] = actual;

            System.out.print("Paso " + i + ": ");
            imprimirArreglo(arreglo);
        }
    }

}
