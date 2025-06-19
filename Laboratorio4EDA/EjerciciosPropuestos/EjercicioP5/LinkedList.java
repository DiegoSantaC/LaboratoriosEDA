package Laboratorio4EDA.EjerciciosPropuestos.EjercicioP5;

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
            this.head = new Node<>(x, this.head);
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
        if(!isEmpty()){
            if(head.getData().equals(e)){
                head=head.getNext();
            }else{
                Node<T> prev=head;
                Node<T> aux=prev.getNext();
                while (aux != null && !aux.getData().equals(e)){
                    prev=aux;
                    aux=aux.getNext();
                }
                if(aux != null)
                    prev.setNext(aux.getNext());
                else
                   System.out.println("No se encontro este elemento en la lista");
            } count --;
        } else 
            System.out.println("La lista esta vacia");
    }

    public void deleteAtPosition(int i) {
        if (!isEmpty()) {
            if (i < 0 || i >= count) {
                System.out.println("Posición inválida.");
            } else {
                if (i == 0) {
                    head=head.getNext();
                } else {
                    Node<T> prev = head;
                    Node<T> aux = head.getNext();
                    int index = 1;
                    while (index < i) {
                        prev = aux;
                        aux = aux.getNext();
                        index++;
                    }
                    prev.setNext(aux.getNext());
                } count --;
            } 
        } else {
            System.out.println("La lista está vacía, no se puede eliminar.");
        }
    }

    public void removeFirts(){
        if (count == 1) {
            head=null;
            count--;
            }else if(!isEmpty()){
                head=head.getNext();
                count--;
            }else
                System.out.println("La lista esta vacia, no se puede eliminar el primer elemento");
    }

    public void removeLast() {
        if (count == 1){ 
            head=null;
            count--;
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
    
    public int search(T x){
        int acum=0;
        for(Node<T> aux=head; aux!=null; aux=aux.getNext()){
            if(x.equals(aux.getData()))
                return acum;
            acum++;
        } return -1;
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
