package mains.calse21;

import java.util.ArrayList;
import java.util.List;
public class Alumno extends Persona{
    private Integer dni;
    private String domicilio;
    private List<Materia> materias = new ArrayList<>();

    public Alumno(String name, String lastName){
        super(name, lastName);
    }

    public Alumno(String name, String lastName, Integer dni){
        super(name, lastName);
        this.dni = dni;
    }

    public Alumno(String nombre, String apellido, Integer dni, String domicilio ) {
        super(nombre, apellido);
        this.dni = dni;
        this.domicilio = domicilio;
    }


    public Integer getDni() {
        return dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public void addMateria(Materia materia){
        this.materias.add(materia);
    }

//    @Override
//    public String toString() {
//        return "Alumno{" +
//                "nombre='" + nombre + '\'' +
//                ", apellido='" + apellido + '\'' +
//                ", dni=" + dni +
//                ", domicilio='" + domicilio + '\'' +
//                ", materias=" + materias +
//                '}';
//    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre=" + super.getNombre() +
                "apellido=" + super.getApellido() +
                "dni=" + dni +
                ", domicilio='" + domicilio + '\'' +
                ", materias=" + materias +
                '}';
    }


}

