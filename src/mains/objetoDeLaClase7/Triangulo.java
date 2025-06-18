package mains.objetoDeLaClase7;

public class Triangulo extends FiguraGeometrica {
    private Double base;
    private Double altura;

    public Triangulo(Double area){
        super(area);
        this.setLados(3);
    }

    public Triangulo(){
        super();
        this.setLados(3);
        this.setAristas(3);
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public Double calcularArea(){
        //Math.pow(this.largoDelLado, 2);
        return (this.base * this.altura) / 2D;
    }

    public Double calcularArea(Double base, Double altura){
        //Math.pow(this.largoDelLado, 2);
        return (base * this.altura) / 2D;
    }
}
