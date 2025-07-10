package mains.objetosDelaClase8;

import mains.interfaces.ILista;

public class Lista implements ILista {

    @Override
    public void agregar(String item) {
        System.out.println("Se agrego el item a la lista");
    }

    @Override
    public void traer(int indice) {
        System.out.println("Se devolvio el elemento de la lsita");
    }
}
