
package com.mycompany.Laboratorio2EDA;
import java.util.Arrays;

public class EjercicioP2 {
    public static void main(String[] ar) {
        int[] vec1 = {1,2,3,4,5,6,7,8,9,10};
        Recursividad1 r=new Recursividad1();
        r.imprimir(vec1);
        int[]vec2 = r.rotarIzquierdaArray(vec1,5);
        r.imprimir(vec2);
    }
    
    static class Recursividad1{
        int cantidad=0;
        int[] B;
        
        public int[] rotarIzquierdaArray(int[] A,int d){
            if(cantidad==0)
                B=Arrays.copyOf(A, A.length);
            
            if(cantidad < d){
                int temp=B[0];
                for(int i=0;i<B.length-1;i++){
                B[i]=B[i+1];
                }
                B[B.length-1]=temp;
                cantidad++;
                rotarIzquierdaArray(B,d);
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
