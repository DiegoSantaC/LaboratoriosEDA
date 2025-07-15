
package Laboratorio9EDA.EjerciciosPropuestos;

public class HashClosed<E> {
    private Register<E>[] table;
    private int size;

    @SuppressWarnings("unchecked")
    public HashClosed(int capacity) {
        table = new Register[capacity];
        size = 0;
    }

    private int hash(int key) {
        return Math.abs(key) % table.length;
    }

    public boolean insert(Register<E> reg) {
        int index = hash(reg.getKey());
        int originalIndex = index;
        do {
            if (table[index] == null || table[index].isDeleted()) {
                table[index] = reg;
                size++;
                return true;
            }
            if (table[index].getKey() == reg.getKey() && !table[index].isDeleted()) {
                System.out.println("Clave duplicada");
                return false;
            }
            index = (index + 1) % table.length;
        } while (index != originalIndex);
        return false; // si la tabla esta llena
    }

    public Register<E> search(int key) {
        int index = hash(key);
        int originalIndex = index;
        do {
            if (table[index] != null && table[index].getKey() == key && !table[index].isDeleted()) {
                return table[index];
            }
            index = (index + 1) % table.length;
        } while (table[index] != null && index != originalIndex);
        return null;
    }

    public void printTable() {
        System.out.println("\n--- Tabla Hash Cerrada ---");
        for (int i = 0; i < table.length; i++) {
            System.out.println("[" + i + "] " + (table[i] == null ? "[VACÍO]" : table[i]));
        }
    }
}
