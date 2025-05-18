
package com.mycompany.Laboratorio2EDA;

public class EjercicioP6 {
    
    public static void main(String[] ar) {
        Recursividad1 r=new Recursividad1();
        r.cuadradoRecursivo(5);
    }
        
    static class Recursividad1{
        int fila=0;
        int col=0;
        public void cuadradoRecursivo(int n){
            if(fila<n){           
                if(col>=n){
                    System.out.println();
                    fila++;
                    col=0;
                    cuadradoRecursivo(n);
                } else {
                    if(fila==0||fila==n-1||col==0||col==n-1)
                        System.out.print("*");
                    else 
                        System.out.print(" "); 
                }
                col++;
                cuadradoRecursivo(n);
            }             
        }  
    }
}
