package mains.calse21;

public class Materia {
    static public String carreras = "Ingenieria en Sistemas, Ingenieria Quimica, Ingenieroa Electromecanica";
    private String nombre;
    private String code;

//    public Materia(String nombre, String code) {
//        this.nombre = nombre;
//        this.code = code;
//    }

//    public Materia(String nombre) {
//        this.nombre = nombre;
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", code='" + code + '\'' +
                '}';
    }


}
