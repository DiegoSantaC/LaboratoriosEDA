import java.util.*;

class Main {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        int limite = sc.nextInt();

        if (limite < 2) {
            System.out.println("No hay números primos menores que 2.");
            return;
        }

        boolean[] esPrimo = generarCriba(limite);
        imprimirPrimos(esPrimo);
    }

    // Método que implementa la Criba de Eratóstenes
    public static boolean[] generarCriba(int limite) {
        boolean[] esPrimo = new boolean[limite + 1];

        for (int i = 2; i <= limite; i++) {
            esPrimo[i] = true;
        }

        // Aplicar criba
        for (int i = 2; i * i <= limite; i++) {
            if (esPrimo[i]) {
                for (int j = i * i; j <= limite; j += i) {
                    esPrimo[j] = false;
                }
            }
        }

        return esPrimo;
    }

    public static void imprimirPrimos(boolean[] esPrimo) {
        System.out.println("Números primos encontrados:");
        for (int i = 2; i < esPrimo.length; i++) {
            if (esPrimo[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
