package Laboratorio4EDA.EjerciciosResueltos;
import java.io.*;

public class EjercicioR3{
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
        // Crea un nuevo nodo con los datos dados
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
    public static LinkedList deleteAtPosition(LinkedList list, int index) {
        Node currNode = list.head, prev = null;
        // CASE 1:
        // si el índice es 0, entonces el nodo principal debe ser eliminado
        if (index == 0 && currNode != null) {
            list.head = currNode.next; 
            System.out.println(index + " position element deleted");
            return list;
        }
        // CASO 2:
        // Si el índice es mayor que 0 pero menor que el
        // tamaño de LinkedList
        int counter = 0;
        while (currNode != null) {
            if (counter == index) {
            prev.next = currNode.next;
            System.out.println(index + " position element deleted");
            break;
            } else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }
        // CASE 3: El indice es mayor que el tamaño de la
        // LinkedList
        if (currNode == null) {
            System.out.println(index + " position element not found");
        }
        return list;
    }
        
    // Código principal
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
        // ******BORRADO POR LA POSICIÓN ******
        deleteAtPosition(list, 0);
        printList(list);
        deleteAtPosition(list, 2);
        printList(list);
        deleteAtPosition(list, 10);
        printList(list);
    }
} }