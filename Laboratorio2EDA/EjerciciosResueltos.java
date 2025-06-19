package Laboratorio2EDA;

public class EjerciciosResueltos {
    static class Recursividad1 {
        void repetir() {
            System.out.println("Hola");
            repetir();
        }
    }
    static class Recursividad2 {
        void imprimir(int n){
            System.out.println(n);
            imprimir(n-1);
        }
    }
    static class Recursividad3 {
        void imprimir(int n) {
            if(n>0){
                System.out.println(n);
                imprimir(n-1);
            }
        }
    }
    static class Recursividad4 {
        void imprimir(int n) {
            if(n>0){
                imprimir(n-1);
                System.out.println(n);
            }
        }
    }
    
    static class Recursividad5 {
        int factorial(int n) {
            if(n==1)
                return 1;
            else
                return n*factorial(n-1);
        }
    }
    
    static class Recursividad6 {   
        void ordenar(int[] v,int cantidad) {
            if(cantidad > 1){
                for(int f=0;f<cantidad-1;f++){
                    if (v[f] > v[f + 1]) {
                        int aux = v[f];
                        v[f] = v[f + 1];
                        v[f + 1] = aux;
                }
                ordenar(v,cantidad-1);    
                }
            }    
        }
        void imprimir(int[] vec) {
            for (int f = 0; f < vec.length; f++)
                System.out.print(vec[f] + " ");
            System.out.println("\n");
        }
    }    
       
    public static void main(String[] ar) {
        //int[] vec1 = { 312, 614, 88, 22, 54 };
        int[] vec2 = { 10,9,8,7,6,5,4,3,2,1};
        Recursividad6 re = new Recursividad6();
        re.imprimir(vec2);
        re.ordenar(vec2,10);
        re.imprimir(vec2);
    }
}

