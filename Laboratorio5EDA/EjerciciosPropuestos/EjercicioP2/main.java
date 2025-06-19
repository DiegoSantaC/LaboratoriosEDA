
package Laboratorio5EDA.EjerciciosPropuestos.EjercicioP2;

public class main {

    public static void main(String[] args) {
        StackLinkedList<Integer> pila=new StackLinkedList<>();
        try{
            
        for(int i=1 ; i<=10 ; i++)
            pila.push(i);
        pila.printStack();
        System.out.println("Mi pila esta llena?: "+pila.isFull());
        pila.destroyStack();
        pila.printStack();
        System.out.println("Mi pila esta llena?: "+pila.isFull());
                
        }catch(ExceptionIsEmpty e){
            System.out.println("Error: "+e.getMessage());
        }
    } 
}
    

