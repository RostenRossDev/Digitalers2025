package mains.clase24;

public class GenericaDosAtributos<K, V> {
    private K codigo;
    private V numero;

    public GenericaDosAtributos(K codigo, V numero) {
        this.codigo = codigo;
        this.numero = numero;
    }

    public K getCodigo() {
        return codigo;
    }
    public void setCodigo(K codigo) {
        this.codigo = codigo;
    }
    public V getNumero() {
        return numero;
    }
    public void setNumero(V numero) {
        this.numero = numero;
    }

}
