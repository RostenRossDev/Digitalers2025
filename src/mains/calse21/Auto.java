package mains.calse21;

public class Auto {
    static private String concesionaria = "consecionaria menganito";
    private String marca;
    private String Modelo;

    public Auto( ) {
    }

    public Auto(String marca, String modelo) {
        this.marca = marca;
        Modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    static public void renameConcesionaria(String name){
        concesionaria = name;
    }

    static public String getConsecionaria(){
        return concesionaria;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "concesionaria='" + concesionaria + '\'' +
                ", marca='" + marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                '}';
    }
}
