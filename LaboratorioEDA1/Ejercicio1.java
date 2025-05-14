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
    System.out.print("\nLa media es: "+media(lista));
    System.out.print("\nLa desviacion estandar es: "+desviacionEstandar(lista));
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

    public static int[] ordenar(int[] lista) {
        int[] listaOrdenada = Arrays.copyOf(lista, lista.length);
        // Ordenamiento por burbuja
        for (int i = 0; i < listaOrdenada.length - 1; i++) {
            for (int j = 0; j < listaOrdenada.length - 1 - i; j++) {
                if (listaOrdenada[j] > listaOrdenada[j + 1]) {
                    int temp = listaOrdenada[j];
                    listaOrdenada[j] = listaOrdenada[j + 1];
                    listaOrdenada[j + 1] = temp;
                }
            }
        }

        return listaOrdenada;
    }

    public static double mediana(int[] lista) {
        int n = lista.length;
        if (n % 2 != 0) {
            return lista[n / 2];
        } else {
            return (lista[n / 2 - 1] + lista[n / 2]) / 2.0;
        }
    }

    public static double desviacionEstandar(int[] lista) {
    double media = media(lista);
    double sumaDiferencias = 0;

    for (int nota : lista) {
        sumaDiferencias += Math.pow(nota - media, 2);
    }

    return Math.sqrt(sumaDiferencias / lista.length);
    }   

    public static double media(int[] lista) {
    double suma = 0;
    for (int nota : lista) {
        suma += nota;
    }
    return suma / lista.length;
    }


}