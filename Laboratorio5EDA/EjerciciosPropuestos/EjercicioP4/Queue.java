
package com.mycompany.Laboratorio5EDA.EjerciciosPropuestos.EjercicioP4;

public interface Queue <E>{
    void enqueue(E x);
    void dequeue() throws ExceptionIsEmpty;
    E back() throws ExceptionIsEmpty;
    E front() throws ExceptionIsEmpty;
    void destroyQueue() throws ExceptionIsEmpty;
    boolean isEmpty ();
    void printQueue();
}
