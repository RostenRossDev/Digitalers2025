package mains.clase24;

public class Nodo <K>{

    private Nodo<K> anterior;
    private K valor;
    private Nodo<K> siguiente;

    public Nodo(K valor) {
        this.valor = valor;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public K getValor() {
        return valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public void setValor(K valor) {
        this.valor = valor;
    }

    public void setSiguiente(Nodo<K> siguiente) {
        this.siguiente = siguiente;
    }


    @Override
    public String toString() {
        return valor.toString();
    }
}
