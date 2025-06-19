
package Laboratorio6EDA.Ejercicio1;

public class ItemNotFound extends Exception {

    public ItemNotFound() {
    }
    
    public ItemNotFound(String msg) {
        super("Error: "+msg);
    }
}
