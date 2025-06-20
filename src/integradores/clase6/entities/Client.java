package integradores.clase6.entities;

public class Client {
    private String pass;
    private String username;

    public Client(String pass, String username) {
        this.pass = pass;
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
