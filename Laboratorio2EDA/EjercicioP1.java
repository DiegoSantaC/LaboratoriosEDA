package Laboratorio2EDA;

import java.util.*;

public class EjercicioP1 {
    public static void main(String[] ar) {
        int[] vec1 = {1,2,3,4,5};
        Recursividad1 r=new Recursividad1();
        r.imprimir(vec1);
        int[]vec2 = r.invertirArray(vec1);
        r.imprimir(vec2);
    }
    
    static class Recursividad1{
        int cantidad=0;
        int[] B;
        
        public int[] invertirArray(int[] A){
            if(cantidad==0)
                B=Arrays.copyOf(A, A.length);
            
            if(cantidad<B.length/2){
                int temp=B[cantidad];
                B[cantidad]=B[B.length-1-cantidad];
                B[B.length-1-cantidad]=temp;
                cantidad++;
                invertirArray(B);
            }
            return B;
        }
        
        void imprimir(int[] vec) {
            for (int f = 0; f < vec.length; f++)
                System.out.print(vec[f] + " ");
            System.out.println("\n");
        }
    }
}
