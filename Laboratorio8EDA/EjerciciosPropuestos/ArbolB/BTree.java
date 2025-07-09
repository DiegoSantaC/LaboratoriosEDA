
package Laboratorio8EDA.EjerciciosPropuestos.ArbolB;
import java.util.*;

public class BTree<E extends Comparable<E>> {
    private BNode<E> root;
    private int orden;
    private boolean up;
    private BNode<E> nDes;

    public BTree(int orden) {
        this.root = null;
        this.orden = orden;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public void insert(E cl) {
        up = false;
        E mediana;
        BNode<E> nuevaRaiz;

        mediana = push(null, root, cl);

        if (up) {
            nuevaRaiz = new BNode<>(orden, false);
            nuevaRaiz.claves.set(0, mediana);
            nuevaRaiz.hijos.set(0, root);
            nuevaRaiz.hijos.set(1, nDes);
            root = nuevaRaiz;
        }
    }

    public BNode<E> insertRecursivo(BNode<E> padre, BNode<E> actual, E clave) {
        return actual == null ? null : push(padre, actual, clave) != null ? actual : null;
    }

    private E push(BNode<E> padre, BNode<E> actual, E clave) {
        int[] pos = new int[1];

        if (actual == null) {
            up = true;
            nDes = null;
            return clave;
        }

        boolean existe = actual.searchNode(clave, pos);
        if (existe) {
            up = false;
            return null;
        }

        E mediana = push(actual, actual.hijos.get(pos[0]), clave);

        if (up) {
            if (actual.nodeFull(orden)) {
                mediana = dividirNodo(actual, mediana, pos[0]);
            } else {
                insertarEnNodo(actual, mediana, nDes, pos[0]);
                up = false;
            }
            return mediana;
        }

        return null;
    }

    private void insertarEnNodo(BNode<E> nodo, E clave, BNode<E> hijoDer, int pos) {
        for (int i = nodo.claves.size() - 1; i > pos; i--) {
            nodo.claves.set(i, nodo.claves.get(i - 1));
            nodo.hijos.set(i + 1, nodo.hijos.get(i));
        }
        nodo.claves.set(pos, clave);
        nodo.hijos.set(pos + 1, hijoDer);
    }

    private E dividirNodo(BNode<E> nodo, E clave, int posClave) {
    // Crear listas temporales completas con claves e hijos actuales
    ArrayList<E> tempClaves = new ArrayList<>();
    ArrayList<BNode<E>> tempHijos = new ArrayList<>();

    // Agregar claves actuales ignorando nulls
    for (E c : nodo.claves) {
        if (c != null) tempClaves.add(c);
    }
    // Insertar la nueva clave en la posición correcta
    tempClaves.add(posClave, clave);

    // Agregar hijos actuales
    for (BNode<E> h : nodo.hijos) {
        tempHijos.add(h);
    }
    // Insertar el nuevo hijo (nDes) en la posición adecuada
    tempHijos.add(posClave + 1, nDes);

    int mid = tempClaves.size() / 2;
    E mediana = tempClaves.get(mid);

    // Crear nuevo nodo derecho
    nDes = new BNode<>(orden, nodo.esHoja);

    // Limpiar el nodo original
    for (int i = 0; i < orden - 1; i++) {
        nodo.claves.set(i, null);
        nodo.hijos.set(i, null);
    }
    nodo.hijos.set(orden - 1, null);

    // Rellenar nodo izquierdo con claves < mediana
    for (int i = 0; i < mid; i++) {
        nodo.claves.set(i, tempClaves.get(i));
        nodo.hijos.set(i, tempHijos.get(i));
    }
    nodo.hijos.set(mid, tempHijos.get(mid));

    // Rellenar nuevo nodo derecho con claves > mediana
    for (int i = mid + 1, j = 0; i < tempClaves.size(); i++, j++) {
        nDes.claves.set(j, tempClaves.get(i));
        nDes.hijos.set(j, tempHijos.get(i));
    }
    nDes.hijos.set(tempClaves.size() - mid - 1, tempHijos.get(tempClaves.size()));

    return mediana;
}
    
    public void imprimir() {
    imprimir(this.root, 0);
}

private void imprimir(BNode<E> nodo, int nivel) {
    if (nodo == null) return;
    
    System.out.print("    ".repeat(nivel));
    System.out.println(nodo);

    int hijosValidos = 0;
    for (BNode<E> hijo : nodo.hijos) {
        if (hijo != null) hijosValidos++;
    }

    for (int i = 0; i < hijosValidos; i++) {
        imprimir(nodo.hijos.get(i), nivel + 1);
    }
}
}
