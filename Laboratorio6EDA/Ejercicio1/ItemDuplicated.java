
package com.mycompany.Laboratorio6EDA.Ejercicio1;

public class ItemDuplicated extends Exception {

    public ItemDuplicated() {
    }
    
    public ItemDuplicated(String msg) {
        super("Error: "+msg);
    }
}
