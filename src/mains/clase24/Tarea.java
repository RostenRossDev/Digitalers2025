package mains.clase24;

public class Tarea implements Comparable<Tarea> {
    String nombre;
    int prioridad; // 1 = alta, 2 = media, 3 = baja

    public Tarea(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Tarea otra) {
        // Ordenamos por prioridad (menor número = mayor prioridad)
        return Integer.compare(this.prioridad, otra.prioridad);
    }

    @Override
    public String toString() {
        return nombre + " (Prioridad: " + prioridad + ")";
    }
}