
package com.mycompany.Laboratorio1EDA;
import java.util.*;

public class EjerciciosResueltos {
  public static void main(String[] args){
  listaOrdenada();      
  }
  
  public static void EdadGrupo() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el número de personas: ");
    int n = scanner.nextInt();
    int[] edades = new int[n];
    System.out.println("Ingrese las edades:");
    for (int i = 0; i < n; i++) {
        edades[i] = scanner.nextInt();
    }
    int suma = 0, mayor = edades[0], menor = edades[0];
    for (int edad : edades) {
        suma += edad;
    if (edad > mayor)
        mayor = edad;
    if (edad < menor)
        menor = edad;
    }
    double promedio = (double) suma / n;
    System.out.println("Edad promedio: " + promedio);
    System.out.println("Edad mayor: " + mayor);
    System.out.println("Edad menor: " + menor);
    scanner.close(); //----Ejercicio Propuesto 1 
  }
  
  public static void SumaNaturales() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un número N: ");
    int n = scanner.nextInt();
    int suma = 0, contador = 1;
    while (contador <= n) {
        suma += contador;
        contador++;
    }
    System.out.println("La suma de los primeros " + n + " números naturales es: "
    + suma);
    scanner.close();   
  }
  
  public static void listaOrdenada() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el número de elementos: ");
    int n = scanner.nextInt();
    int[] numeros = new int[n];
    System.out.println("Ingrese los números:");
    for (int i = 0; i < n; i++) {
        numeros[i] = scanner.nextInt();
    }
    boolean estaOrdenada = true; // Invariante: Se supone que la lista está ordenada
    for (int i = 1; i < n; i++) {
        if (numeros[i] < numeros[i - 1]) {
            estaOrdenada = false; // Se rompe la invariante si encontramos un desorden
        break;
        }
    }
    System.out.println("¿Está ordenada la lista?: " + (estaOrdenada ? "Sí" :
    "No"));
    scanner.close();
  }
}
    

