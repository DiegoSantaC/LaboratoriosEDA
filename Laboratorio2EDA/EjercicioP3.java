
package com.mycompany.Laboratorio2EDA;

import java.util.Arrays;

public class EjercicioP3 {
    
    public static void main(String[] ar) {
        Recursividad1 r=new Recursividad1();
        r.trianguloRecursivo1(5);
    }
    
    static class Recursividad1{
        
        public void trianguloRecursivo1(int n){
            if(n>=1){
                trianguloRecursivo1(n-1);
                for(int i=0;i<n;i++)
                    System.out.print("*");
                System.out.println();
            }             
        }  
    }
}
