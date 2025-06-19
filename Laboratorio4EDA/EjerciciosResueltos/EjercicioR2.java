package Laboratorio4EDA.EjerciciosResueltos;
import java.io.*;

public class EjercicioR2{
// Un programa java para implementar una simple lista enlazada
public static class LinkedList{
    Node head; 
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

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

    public static void printList(LinkedList list) {
        Node currNode = list.head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }    

    // **************DELETION BY KEY**************
    public static LinkedList deleteByKey(LinkedList list, int key) {
        Node currNode = list.head, prev = null;
        // CASO 1:
        // Si el nodo principal tiene el dato que se va a eliminar
        if (currNode != null && currNode.data == key) {
            list.head = currNode.next; 
            System.out.println(key + " found and deleted");
            return list;
        }
        // CASO 2:
        // Si el dato está en otro lugar que no sea la cabecera
        while (currNode != null && currNode.data != key) {
            // si currNode no tiene el dato
            // continua con el siguiente nodo
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode != null) {
            prev.next = currNode.next;
            System.out.println(key + " found and deleted");
        }
        // CASO 3: El dato no está presente
        // Si la el dato no está presente en linked list
        if (currNode == null) {
            System.out.println(key + " not found");
        }
        return list;
    }

    public static void main(String[] args) {
    LinkedList list = new LinkedList();
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
        // ******Eliminación por dato ******
        deleteByKey(list, 1);
        printList(list);
        deleteByKey(list, 4);
        printList(list);
        deleteByKey(list, 10);
        printList(list);
    }
} }