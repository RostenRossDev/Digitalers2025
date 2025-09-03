package mains.clase24;

public class Lista <K>{

    private Nodo<K> primerElemento;
    private Nodo<K> ultimoElemento;
    private Nodo<K> nodoDeFin = new Nodo<>(null);
    private int cantidad = 0;

    public Lista(Nodo<K> primerElemento) {
        this.primerElemento = primerElemento;
        this.ultimoElemento = primerElemento;
        this.ultimoElemento.setSiguiente(this.nodoDeFin);
        this.cantidad = 1;
    }

    public Lista() {
    }

    public void agregarElemento(Nodo<K> e){
        if(this.ultimoElemento != null){
            //caso de que la lista ya tenga elementos
            this.ultimoElemento.setSiguiente(e);
            e.setAnterior(this.ultimoElemento);
            this.ultimoElemento = e;
        }else {
            //caso de lista vacia
            this.ultimoElemento = e;
            this.primerElemento = e;
            e.setAnterior(this.nodoDeFin);
        }
        //this.ultimoElemento = e;
        e.setSiguiente(nodoDeFin);
        this.cantidad += 1;
    }

    public void eliminarElemento(int indice){
        Nodo<K> actual = this.primerElemento;
        for (int contador = 0 ; contador <= this.cantidad; contador++) {
            if(indice == contador){
               Nodo<K> anterior=  actual.getAnterior();
               Nodo<K> siguiente = actual.getSiguiente();
               siguiente.setAnterior(anterior);
               anterior.setSiguiente(siguiente);
               this.cantidad -= 1;
               return;
            }
            actual = actual.getSiguiente();
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {

        String resultado = "{";

        Nodo<K> actual = this.primerElemento;
        while (actual.getSiguiente() != null ){
            resultado =  resultado + actual.getValor().toString() + ", ";
            actual = actual.getSiguiente();
        }

        resultado = resultado.replaceAll(".{2}$", "");
        resultado = resultado.concat("}");
        return resultado;
    }
}
