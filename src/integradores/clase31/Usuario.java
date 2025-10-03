package integradores.clase31;

public class Usuario {
    private Name name;

    private String email;

    public String getNombre() {
        return name.first;
    }

    public String getApellido() {
        return name.last;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombre(String nombre){
        this.name.first = nombre;
    }

    public void setApellido(String apellido){
        this.name.last = apellido;
    }

    // clase interna
    private class Name {
        String first;
        String last;

        public Name(){

        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre=" + name.first +
                ", apellido='" + name.last + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Usuario(String nombre, String apellido, String email) {
        this.name = new Name();
        this.name.last = apellido;
        this.name.first = nombre;
        this.email = email;
    }

    public Usuario( ) {
        System.out.println("constructor vacio");
        this.name = new Name();
    }
}
