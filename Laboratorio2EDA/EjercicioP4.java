
package com.mycompany.Laboratorio2EDA;

public class EjercicioP4 {
    public static void main(String[] ar) {
        Recursividad1 r=new Recursividad1();
        r.trianguloRecursivo2(10);
    }
    
    static class Recursividad1{
        int fila=0;
        public void trianguloRecursivo2(int n){
            if(fila<=n){
                for(int i=0;i<n-fila;i++)
                    System.out.print(" ");
                for(int j=0;j<fila;j++)
                    System.out.print("*");
                System.out.println();
                fila++;
                trianguloRecursivo2(n);
            }             
        }  
    }
}
