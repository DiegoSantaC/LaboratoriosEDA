
package com.mycompany.laboratorio3eda.Ejercicio2;
import java.util.*;
public class Main2 {
    
    public static <T extends Number> double suma(T valor1, T valor2) {
        return valor1.doubleValue() + valor2.doubleValue();
    }
    
    public static <T extends Number> double resta(T valor1, T valor2) {
        return valor1.doubleValue() - valor2.doubleValue();
    }

    public static <T extends Number> double producto(T valor1, T valor2) {
        return valor1.doubleValue() * valor2.doubleValue();
    }

    public static <T extends Number> double division(T valor1, T valor2) {
        return valor2.doubleValue() == 0 ? Double.NaN : valor1.doubleValue() / valor2.doubleValue();
    }

    public static <T extends Number> double potencia(T base, T exponente) {
        return Math.pow(base.doubleValue(), exponente.doubleValue());
    }

    public static <T extends Number> double raizCuadrada(T valor) {
        return Math.sqrt(valor.doubleValue());
    }

    public static <T extends Number> double raizCubica(T valor) {
        return Math.cbrt(valor.doubleValue());
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("\n--- Menu de Operaciones Clases Genericas ---");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. Division");
            System.out.println("5. Potencia");
            System.out.println("6. Raiz Cuadrada");
            System.out.println("7. Raiz Cubica");
            System.out.println("8++. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();
            
            if (opcion >= 1 && opcion <= 5) {
                System.out.print("Tipo (1 = Integer, 2 = Double): ");
                int tipo = scanner.nextInt();
                if (tipo == 1) {
                    System.out.print("Ingrese valor 1: ");
                    Integer v1 = scanner.nextInt();
                    System.out.print("Ingrese valor 2: ");
                    Integer v2 = scanner.nextInt();
                    ejecutarOperacion(opcion, v1, v2);
                } else if (tipo == 2) {
                    System.out.print("Ingrese valor 1: ");
                    Double v1 = scanner.nextDouble();
                    System.out.print("Ingrese valor 2: ");
                    Double v2 = scanner.nextDouble();
                    ejecutarOperacion(opcion, v1, v2);
                }
            }    
        } while (opcion>=1&&opcion<8);
        System.out.print("Saliendo del programa----Tenga un buen dia");
    }
    
    private static <T extends Number> void ejecutarOperacion(int opcion, T v1, T v2) {
        switch (opcion) {
            case 1 -> System.out.println("Resultado: " + suma(v1, v2));
            case 2 -> System.out.println("Resultado: " + resta(v1, v2));
            case 3 -> System.out.println("Resultado: " + producto(v1, v2));
            case 4 -> System.out.println("Resultado: " + division(v1, v2));
            case 5 -> System.out.println("Resultado: " + potencia(v1, v2));
        }
    }
     
}
