
package Laboratorio9EDA.EjerciciosPropuestos;



public class HashOpened<E> {
    private LinkedList<Register<E>>[] table;

    @SuppressWarnings("unchecked")
    public HashOpened(int capacity) {
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return Math.abs(key) % table.length;
    }

    public void insert(Register<E> reg) {
        int index = hash(reg.getKey());
        if (search(reg.getKey()) == null) {
            table[index].addLast(reg);
            System.out.println("Insertado: " + reg);
        } else {
            System.out.println("Clave duplicada: " + reg.getKey());
        }
    }

    public void delete(int key) {
        int index = hash(key);
        for (Node<Register<E>> aux = table[index].getHead(); aux != null; aux = aux.getNext()) {
            if (aux.getData().getKey() == key && !aux.getData().isDeleted()) {
                aux.getData().delete();
                System.out.println("Eliminado lógicamente: " + key);
                return;
            }
        }
        System.out.println("Clave no encontrada: " + key);
    }

    public Register<E> search(int key) {
        int index = hash(key);
        for (Node<Register<E>> aux = table[index].getHead(); aux != null; aux = aux.getNext()) {
            if (aux.getData().getKey() == key && !aux.getData().isDeleted()) {
                return aux.getData();
            }
        }
        return null;
    }

    public void showTable() {
        System.out.println("\n--- Tabla Hash Abierta ---");
        for (int i = 0; i < table.length; i++) {
            System.out.print("[" + i + "] ");
            if (table[i].isEmpty()) {
                System.out.println("[VACÍO]");
            } else {
                for (Node<Register<E>> aux = table[i].getHead(); aux != null; aux = aux.getNext()) {
                    System.out.print(aux.getData() + " -> ");
                }
                System.out.println("null");
            }
        }
    }
}
