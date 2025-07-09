
package Laboratorio8EDA.EjerciciosPropuestos.ArbolB;
import java.util.ArrayList;

public class BNode<E extends Comparable<E>> {
    protected ArrayList<E> claves;
    protected ArrayList<BNode<E>> hijos;
    public boolean esHoja;

    public BNode(int orden, boolean esHoja) {
        this.esHoja = esHoja;
        this.claves = new ArrayList<>(orden - 1);
        this.hijos = new ArrayList<>(orden);
        for (int i = 0; i < orden - 1; i++) {
            this.claves.add(null);
        }
        for (int i = 0; i < orden; i++) {
            this.hijos.add(null);
        }
    }

    public boolean nodeFull(int orden) {
        int count = 0;
        for (E clave : claves)
            if (clave != null) count++;
        return count >= orden - 1;
    }

    public boolean searchNode(E data, int[] pos) {
        for (int i = 0; i < claves.size(); i++) {
            E clave = claves.get(i);
            if (clave == null) {
                pos[0] = i;
                return false;
            }
            if (data.compareTo(clave) < 0) {
                pos[0] = i;
                return false;
            }
            if (data.equals(clave)) {
                pos[0] = i;
                return true;
            }
        }
        pos[0] = claves.size();
        return false;
    }

    @Override
    public String toString() {
        String s = "";
        for (E clave : claves) {
            if (clave != null) {
                s += clave + " ";
            }
        }
        return s.trim();
    }
}
