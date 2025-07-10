package integradores.clase6.entities;

import integradores.clase6.start.HomeBanking;
import integradores.clase6.util.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Client {
    private String pass;
    private String email;
    private String name;
    private String lastname;
    private Integer dni;
    private List<Account> accounts = new ArrayList<>();

    public Client(String pass, String email) {
        this.pass = pass;
        this.email = email;
        Account ac = new Account();
        this.accounts.add(ac);
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Account getAccount() {
        return accounts.get(0);
    }

    public void setAccount(Account account) {
        this.accounts.add(0, account);
        this.accounts.remove(1);
    }

    public static void recoveryCredential( HomeBanking home){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese su correo para recuperar su clave: ");
        String email = read.nextLine();
        for (Client cliente: HomeBanking.clients){
            if (cliente.getEmail().equals(email)){
                Integer token = generateRecoveryToken(); //imaginamos que se lo enviamos al correo

                int retry = 0;
                do {
                    read = new Scanner(System.in);
                    System.out.println("Ingrese el token enviado al correo: ");
                    Integer intputToken = Integer.parseInt(read.nextLine());

                    if (Objects.equals(intputToken, token)) {
                        read = new Scanner(System.in);
                        System.out.println("Ingrese su nueva contraseña: ");
                        String newPassword = read.nextLine();
                        cliente.setPass(newPassword);
                        return;
                    }
                    retry++;
                    System.out.println("El token ingresado es invalido. Le quedan " + (3 - retry ) + " intentos." );
                }while (retry < 3);
                System.out.println("Intentos agotados, pruebe mas tarde.");
                return;
            }
        }
        System.out.println("No existe el usuario.");
    }

    public static void updateCredential(String email, HomeBanking home){
        for (Client cliente: HomeBanking.clients){
            if (cliente.getEmail().equals(email)){
                Scanner read = new Scanner(System.in);
                System.out.println("Ingrese el nuevo Correo: ");
                String newEmail = read.nextLine();
                read = new Scanner(System.in);
                System.out.println("Ingrese su nueva contraseña: ");
                String newPassword = read.nextLine();
                cliente.setEmail(newEmail);
                cliente.setPass(newPassword);
                System.out.println("Se modificaron los credenciales de acceso con exito.");
                home.start();
                break;
            }
        }

        System.out.println("No se pudieron actualizar los credenciales.");
        Menu.accountMenu(email, home);
    }

    public static void deletCounnt(String email, HomeBanking home){
        for (int i = 0; i < HomeBanking.clients.length; i++){
            if (HomeBanking.clients[i].getEmail().equals(email)){
                HomeBanking.clients[i] = null;
                System.out.println("Cuenta eliminada con exito.");
                home.start();
                break;
            }
        }
        System.out.println("La cuenta no se pudo eliminar.");
        Menu.accountMenu(email, home);
    }

    public static Integer generateRecoveryToken(){
        do {
            Integer token = (int) (Math.random() * 9000) + 1000;
            System.out.printf("\nClave token recuperacion enviado al mail: %d ", token);
            if (!tieneCaracteresRepetidos(token))
                return  token;
        }while (true);
    }

    public static boolean tieneCaracteresRepetidos(int numero) {
        String s = String.valueOf(numero);
        Boolean isValid =  s.charAt(0) == s.charAt(1) ||
                s.charAt(0) == s.charAt(2) ||
                s.charAt(0) == s.charAt(3) ||
                s.charAt(1) == s.charAt(2) ||
                s.charAt(1) == s.charAt(3) ||
                s.charAt(2) == s.charAt(3);
        return  isValid;
    }
}
