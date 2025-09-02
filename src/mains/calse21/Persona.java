package mains.calse21;

public class Persona {
        private String nombre;
        private String apellido;
        private Boolean estaVivo;

        public Persona(String nombre, String apellido){
            this.nombre=nombre;
            this.apellido=apellido;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Boolean isEstaVivo() {

            return estaVivo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", estaVivo=" + estaVivo +
                '}';
    }

    public final String nuevoToString(){
            return "....";
    }
}
