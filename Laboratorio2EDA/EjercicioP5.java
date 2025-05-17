
package com.mycompany.Laboratorio2EDA;

public class EjercicioP5 {
    
    public static void main(String[] ar) {
        Recursividad1 r=new Recursividad1();
        r.trianguloRecursivo3(10);
    }
    
    static class Recursividad1{
        int fila=1;
        int col=0;
        public void trianguloRecursivo3(int n){
        int anchoTotal=n*2-1;
        if (fila<=n) {
            if (col >= anchoTotal) {
                System.out.println();
                fila++;
                col = 0;
                trianguloRecursivo3(n);
            } else {
                int inicio = (anchoTotal-(fila*2-1))/2;
                if (col<inicio) {
                    System.out.print(" ");
                } else if ((col-inicio)%2==0 && (col-inicio)/2<fila) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                col++;
                trianguloRecursivo3(n);
            }
        }        
        }
    }
}

