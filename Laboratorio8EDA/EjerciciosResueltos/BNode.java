
package Laboratorio8EDA.EjerciciosResueltos;
import java.util.*;

public class BNode<E extends Comparable<E>> {
    protected ArrayList<E> keys;
    protected ArrayList<BNode<E>> childs;
    protected int count;

    public BNode(int n) {
        this.keys = new ArrayList<>(n);
        this.childs = new ArrayList<>(n + 1); // hijos = claves + 1
        this.count = 0;
        for (int i = 0; i < n; i++) {
            this.keys.add(null);
        }
        for (int i = 0; i < n + 1; i++) {
            this.childs.add(null);
        }
    }

    // ✅ Check if the current node is full
    public boolean nodeFull(int orden) {
        return count == orden - 1;
    }

    // ✅ Check if the current node is empty
    public boolean nodeEmpty() {
        return count == 0;
    }

    // ✅ Search for a key in the current node
    public boolean searchNode(E data, int[] pos) {
        int i = 0;
        while (i < count && data.compareTo(keys.get(i)) > 0) {
            i++;
        }

        pos[0] = i;

        if (i < count && data.compareTo(keys.get(i)) == 0) {
            return true;
        } else {
            return false;
        }
    }

    // ✅ Return the keys found in the node
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        for (int i = 0; i < count; i++) {
            sb.append(keys.get(i)).append(" ");
        }
        sb.append("]");
        return sb.toString();
    }

    // ✅ Optional utility: totalClaves (frequently needed in BTree)
    public int totalClaves() {
        return count;
    }

    // ✅ Optional: remove a key at a specific index
    public void removeKeyAt(int index) {
        for (int i = index; i < count - 1; i++) {
            keys.set(i, keys.get(i + 1));
        }
        keys.set(count - 1, null);
        count--;
    }

    // ✅ Optional: remove a child at a specific index
    public void removeChildAt(int index) {
        for (int i = index; i < childs.size() - 1; i++) {
            childs.set(i, childs.get(i + 1));
        }
        childs.set(childs.size() - 1, null);
    }
}
