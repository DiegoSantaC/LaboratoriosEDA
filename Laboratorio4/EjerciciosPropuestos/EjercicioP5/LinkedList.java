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
        
        public void removeFirts(){
            if(!isEmpty()){
                head=head.getNext();
                count--;
            } else
                System.out.println("La lista esta vacia, no se puede eliminar el primer elemento");
	}
        
        public void removeLast() {
            if (count == 1){ 
                removeFirts();
            }else if (!isEmpty()){
                Node<T> aux = this.head;
                while (aux.getNext().getNext() != null)
                    aux = aux.getNext();
                aux.setNext(null);
                count --;
                }else 
                    System.out.println("La lista esta vacia, no se puede eliminar el ultimo elemento");
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
