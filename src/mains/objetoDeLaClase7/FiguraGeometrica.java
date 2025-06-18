package mains.objetoDeLaClase7;

public class FiguraGeometrica {
    private Double area;
    private Integer lados;
    private Integer aristas;

    public FiguraGeometrica(Double area){
        this.area = area;
    }

    public FiguraGeometrica(){

    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Integer getLados() {
        return lados;
    }

    public void setLados(Integer lados) {
        this.lados = lados;
    }

    public Integer getAristas() {
        return aristas;
    }

    public void setAristas(Integer aristas) {
        this.aristas = aristas;
    }

    public Double calcularArea(){
        return 5D;
    }
}
