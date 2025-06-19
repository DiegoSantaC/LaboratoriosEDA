package Laboratorio4EDA.EjerciciosResueltos;
import java.io.*;

public class EjercicioR1{
// Un programa java para implementar una simple lista enlazada
public static class LinkedList {
    Node head; 
    static class Node {
        int data;
        Node next;
        // Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }
// Método para insertar un nuevo nodo
    public static LinkedList insert(LinkedList list, int data) {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
                }
            last.next = new_node;
        }
        return list;
    }
// Metodo para imprimir la lista enlazada LinkedList.
    public static void printList(LinkedList list) {
        Node currNode = list.head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }
        
    public static void main(String[] args) {
    LinkedList list = new LinkedList();

        // ******INSERCIÓN******
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
        System.out.println("Hola");
        printList(list);
    }
} }