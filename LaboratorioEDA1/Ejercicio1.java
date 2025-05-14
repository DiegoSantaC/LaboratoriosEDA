import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Ingresar el numero de Estudiantes: ");
    int [] lista= new int[sc.nextInt()];
    
    for(int i=0;i<lista.length;i++){
        System.out.print("Ingrese la nota de un estudiante: ");
        lista[i]=sc.nextInt();
    }
    for(int nota : lista){
        System.out.print("["+nota+"] ");    
    }
    System.out.println("\nLa moda es: "+moda(lista));

    
    for(int nota: ordenar(lista)){
        System.out.print("["+nota+"] ");    
    }
        System.out.print("\nLa mediana es: "+mediana(ordenar(lista)));
    }

    public static int moda(int[] lista){
        int moda=0;
        int acumuladorModa=0;
        for(int nota1: lista){
            int acumulador=0;
            for(int nota2: lista){
                if(nota1==nota2)
                acumulador++;
            }
            if(acumulador>acumuladorModa){
                acumuladorModa=acumulador;
                moda=nota1;
            }    
        }
        return moda;
    }
    // Metodo Burbuja
    public static int[] ordenar(int[] lista) {
        // Crear una nueva lista para no modificar la original
        int[] listaOrdenada = Arrays.copyOf(lista, lista.length);

        // Ordenamiento por burbuja
        for (int i = 0; i < listaOrdenada.length - 1; i++) {
            for (int j = 0; j < listaOrdenada.length - 1 - i; j++) {
                if (listaOrdenada[j] > listaOrdenada[j + 1]) {
                    // Intercambiar los valores
                    int temp = listaOrdenada[j];
                    listaOrdenada[j] = listaOrdenada[j + 1];
                    listaOrdenada[j + 1] = temp;
                }
            }
        }

        return listaOrdenada;
    }

    // Metodo para calcular la mediana
    public static double mediana(int[] lista) {
        int n = lista.length;
        if (n % 2 != 0) {
            // Si el número de elementos es impar, la mediana es el valor central
            return lista[n / 2];
        } else {
            // Si el número de elementos es par, la mediana es el promedio de los dos valores centrales
            return (lista[n / 2 - 1] + lista[n / 2]) / 2.0;
        }
    }


}