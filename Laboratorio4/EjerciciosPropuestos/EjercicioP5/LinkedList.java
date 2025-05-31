package com.mycompany.Laboratorio4.EjerciciosPropuestos.EjercicioP5;

public class LinkedList<T>{
	private Node<T> head;
	private int count;
	
	public LinkedList() {
		this.head = null;
		this.count = 0;
	}
	
	public boolean isEmpty() {
		return this.head == null;
	}
	
	public void addFirst(T x) {
		this.head = new Node<T>(x, this.head);
		this.count ++;
	}
	
	public void addLast(T x) {
            if (isEmpty())
                    addFirst(x);
            else {
                Node<T> aux = this.head;
                while (aux.getNext() != null)
                        aux = aux.getNext();
                if(!aux.getData().equals(x)) {
                        aux.setNext(new Node<T>(x));
                        this.count ++;
                }
            }
	}
	
        public void deleteByKey(T e){
            
        }
        public void deleteAtPosition(int i){
            
        }
        
        public void removeFirts() {
		
	}
        
        public void removeLast() {
            
        }
        
	public int size() {
            return this.count;
	}
	
        public void printList(){
            System.out.println("Mi lista enlazada es: "+ toString());
        }
        
        @Override
	public String toString() {
            String str = "";
            for(Node<T> aux = this.head; aux != null; aux = aux.getNext())
                    str += aux.toString() + ", ";
            return str;
	}
	
}
