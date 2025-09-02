package mains.clase24;

public class DosAtributos {

    private Object nro;
    private Object codigo;

    public DosAtributos(Object nro, Object codigo) {
        this.nro = nro;
        this.codigo = codigo;
    }

    public Object getNro() {
        return nro;
    }

    public void setNro(Object nro) {
        this.nro = nro;
    }

    public Object getCodigo() {
        return codigo;
    }

    public void setCodigo(Object codigo) {
        this.codigo = codigo;
    }
}
