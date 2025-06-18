package mains.objetoDeLaClase7;

public class Cuadrado extends FiguraGeometrica{

    private Double largoDelLado;

    public Cuadrado(Double area, Double largo){
        super(area);
        this.setLados(4);
        this.largoDelLado = largo;
    }

    public Cuadrado(){
        super();
        this.setLados(4);
        this.setAristas(4);
    }

    public Double getLargoDelLado() {
        return largoDelLado;
    }

    public void setLargoDelLado(Double largoDelLado) {
        this.largoDelLado = largoDelLado;
    }

    @Override
    public Double calcularArea(){
        //Math.pow(this.largoDelLado, 2);
        return this.largoDelLado * this.largoDelLado;
    }
}
