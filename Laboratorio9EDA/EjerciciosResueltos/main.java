
package Laboratorio9EDA.EjerciciosResueltos;

public class main {

    public static void main(String[] args) {
        System.out.println("El tamanio de la tabla es: 8.");
        HashOpened<String> hash = new HashOpened<>(8);

        System.out.println("Agregar el elemento: clave: 5, valor: Pepe.");
        hash.insert(new Register<>(5, "Pepe"));

        System.out.println("Agregar el elemento: clave: 21, valor: Jesus.");
        hash.insert(new Register<>(21, "Jesus"));

        System.out.println("Agregar el elemento: clave: 19, valor: Juan.");
        hash.insert(new Register<>(19, "Juan"));

        System.out.println("Agregar el elemento: clave: 16, valor: Maria.");
        hash.insert(new Register<>(16, "Maria"));

        System.out.println("Agregar el elemento: clave: 21, valor: DUPLICADO.");
        hash.insert(new Register<>(21, "DUPLICADO")); // debe decir clave duplicada

        System.out.println("Mostrar tabla hash resultante.");
        hash.showTable();

        System.out.println("Buscar los elementos por clave: 5, 21.");
        Register<String> r1 = hash.search(5);
        System.out.println(r1 != null ? "Encontrado: " + r1 : "No encontrado");

        Register<String> r2 = hash.search(21);
        System.out.println(r2 != null ? "Encontrado: " + r2 : "No encontrado");

        System.out.println("Eliminar los elementos por clave. 21, 100.");
        hash.delete(21); // válido
        hash.delete(100); // inexistente

        System.out.println("Mostrar tabla hash resultante.");
        hash.showTable();
    }     
}

