
package Laboratorio8EDA.EjerciciosPropuestos.ArbolB;
import java.util.*;

public class BTree<E extends Comparable<E>> {
    private BNode<E> root;
    private int orden;
    private boolean up;
    private BNode<E> nDes;

    public BTree(int orden) {
        this.orden = orden;
        this.root = null;
    }

    public void insert(E clave) {
        up = false;
        E mediana = push(root, clave);
        if (up) {
            BNode<E> nuevaRaiz = new BNode<>(orden, false);
            nuevaRaiz.claves.set(0, mediana);
            nuevaRaiz.hijos.set(0, root);
            nuevaRaiz.hijos.set(1, nDes);
            root = nuevaRaiz;
        }
    }

    private E push(BNode<E> nodo, E clave) {
        if (nodo == null) {
            up = true;
            nDes = null;
            return clave;
        }

        int[] pos = new int[1];
        boolean encontrado = nodo.searchNode(clave, pos);
        if (encontrado) {
            up = false;
            return null;
        }

        E mediana = push(nodo.hijos.get(pos[0]), clave);

        if (up) {
            if (!nodo.nodeFull(orden)) {
                insertarEnNodo(nodo, mediana, nDes, pos[0]);
                up = false;
            } else {
                mediana = dividirNodo(nodo, mediana, nDes, pos[0]);
            }
            return mediana;
        }

        return null;
    }

    private void insertarEnNodo(BNode<E> nodo, E clave, BNode<E> hijoDer, int pos) {
        for (int i = orden - 2; i > pos; i--) {
            nodo.claves.set(i, nodo.claves.get(i - 1));
        }
        for (int i = orden - 1; i > pos + 1; i--) {
            nodo.hijos.set(i, nodo.hijos.get(i - 1));
        }

        nodo.claves.set(pos, clave);
        nodo.hijos.set(pos + 1, hijoDer);
    }

    private E dividirNodo(BNode<E> nodo, E clave, BNode<E> hijoDer, int pos) {
        int mid = (orden - 1) / 2;

        ArrayList<E> clavesTemp = new ArrayList<>(orden);
        ArrayList<BNode<E>> hijosTemp = new ArrayList<>(orden + 1);

        for (int i = 0; i < orden - 1; i++)
            clavesTemp.add(nodo.claves.get(i));
        clavesTemp.add(null); 

        for (int i = 0; i < orden; i++)
            hijosTemp.add(nodo.hijos.get(i));
        hijosTemp.add(null); 

        // insertar nueva clave
        for (int i = orden - 1; i > pos; i--)
            clavesTemp.set(i, clavesTemp.get(i - 1));
        clavesTemp.set(pos, clave);

        for (int i = orden; i > pos + 1; i--)
            hijosTemp.set(i, hijosTemp.get(i - 1));
        hijosTemp.set(pos + 1, hijoDer);

        nodo.claves = new ArrayList<>(orden - 1);
        nodo.hijos = new ArrayList<>(orden);
        for (int i = 0; i < orden - 1; i++) nodo.claves.add(null);
        for (int i = 0; i < orden; i++) nodo.hijos.add(null);

        nDes = new BNode<>(orden, nodo.esHoja);

        for (int i = 0; i < mid; i++) {
            nodo.claves.set(i, clavesTemp.get(i));
            nodo.hijos.set(i, hijosTemp.get(i));
        }
        nodo.hijos.set(mid, hijosTemp.get(mid));

        E mediana = clavesTemp.get(mid);

        for (int i = mid + 1, j = 0; i < clavesTemp.size(); i++, j++) {
            if (j < orden - 1) nDes.claves.set(j, clavesTemp.get(i));
        }

        for (int i = mid + 1, j = 0; i < hijosTemp.size(); i++, j++) {
            if (j < orden) nDes.hijos.set(j, hijosTemp.get(i));
        }

        return mediana;
    }

    @Override
    public String toString() {
        if (root == null) return "Árbol vacío.";
        return imprimirRecursivo(root, 0);
    }

    private String imprimirRecursivo(BNode<E> nodo, int nivel) {
        String s = "";

        for (int i = 0; i < nivel; i++) s += "    ";
        s += "[ " + nodo + " ]\n";

        if (!nodo.esHoja) {
            for (BNode<E> hijo : nodo.hijos) {
                if (hijo != null) {
                    s += imprimirRecursivo(hijo, nivel + 1);
                }
            }
        }

        return s;
    }
}
