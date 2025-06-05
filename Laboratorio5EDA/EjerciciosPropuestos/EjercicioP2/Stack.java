
package com.mycompany.Laboratorio5EDA.EjerciciosPropuestos.EjercicioP2;

public interface Stack<E> {
    void push(E x);
    void pop() throws ExceptionIsEmpty;
    E top() throws ExceptionIsEmpty;
    void destroyStack();
    boolean isFull();
    boolean isEmpty ();
}
