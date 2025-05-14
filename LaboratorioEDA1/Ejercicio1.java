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
    System.out.print("\nLa moda es: "+moda(lista));
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
}