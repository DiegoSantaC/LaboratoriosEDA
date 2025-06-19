
package Laboratorio3EDA.EjerciciosResueltoss;

public class Animal {
    String nombre;
    boolean genero;
    public Animal(String nombre, boolean genero) {
        super();
        this.nombre = nombre;
        this.genero = genero;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isGenero() {
        return genero;
    }
    public void setGenero(boolean genero) {
        this.genero = genero;
    }
}
