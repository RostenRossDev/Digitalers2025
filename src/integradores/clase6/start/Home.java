package integradores.clase6.start;

import integradores.clase6.entities.Client;

import java.util.Arrays;
import java.util.Scanner;

public class Home {
    private static String exitMessage = "Gracias por utilizar el Online Backing.";
    private Integer[] tokens = new Integer[100];
    private Integer index = 0;
    private Scanner read = new Scanner(System.in);
    private static Character reTryNo = 'N';
    private static Character reTrySi = 'S';
    private Client[] clients = new Client[20];

    public void execute(){
        init();
        start();
    }

    public void start(){
        System.out.println("Bienvenido a Online  Banking.");
        System.out.println("Para ingresar aprete 1, para registrarse aprete 2: ");
        Integer op = read.nextInt();

        switch (op){
            case 1:
                this.login();
                break;
            case 2:
                this.register();
                break;
        }
    }

    public Boolean login(){
        Integer validToken =  generateToken(tokens, index);
        index++;

        //capturar usurio
        String inputEmail = fillStringData("\nEmail: ", read);
        String inutPass = fillStringData("\nContraseña: ", read);
        Integer inputToken = fillIntegerData("\nClave token: ", read);

        Boolean isValid = isValidUser(inputEmail, inutPass, inputToken, validToken);

        if (isValid){
            System.out.println("Se logueo con exito. Gracias por usar nuestros servicios.");
        } else {
            read = new Scanner(System.in);
            System.out.println("Credenciales incorrectos.");
            reTry();
        }
        return isValid;
    }

    public String fillStringData(String message,Scanner read){
        read = new Scanner(System.in);
        System.out.println(message);
        String value = read.nextLine();
        return value;
    }

    public Integer fillIntegerData(String message,Scanner leer){
        //mostrar un mensaje solicitando el token
        read = new Scanner(System.in);
        System.out.println(message);
        Integer value = leer.nextInt();
        return value;
    }

    public Integer fillDniData(String message,Scanner leer){
        //mostrar un mensaje solicitando el token
        while (true){
            read = new Scanner(System.in);
            System.out.println(message);
            Integer value = leer.nextInt();
            String strValue  = value.toString();
            if (strValue.length() == 8){
                return value;
            }else {
                System.out.println("El dni solo tiene 8 numeros. Vuelva a intentar.");
            }
        }
    }

    public Integer generateToken(Integer[] tokens, Integer index){
        Integer token = null;
        do{
            token = (int) (Math.random()*1000000);

        }while (!validateToken(tokens, index, token));

        tokens[index] = token;
        System.out.printf("\nClave token generada automaticamente: %d ", token);
        return token;
    }

    public Boolean validateToken(Integer[] tokens, Integer index, Integer generatedToken){

        for (int  i = 0; i< index;  i++) {
            if(tokens[i] == generatedToken) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public void reTry(){
        read = new Scanner(System.in);
        System.out.println("\nError de credenciales... Desea intentarlo nuevamente= (S/N): ");
        Character reTry = read.next().toUpperCase().charAt(0);
        if (reTryNo.equals(reTry)) {
            System.out.println(exitMessage);
        } else if (reTrySi.equals(reTry)) {
            read = new Scanner(System.in);
            start();
        }
    }

    public void init(){
        String validUser = "administrador";
        String validPass = "administrador.1234";
        Client defaultClient = new Client(validPass, validUser);
        this.clients[0] = defaultClient;
    }

    public Boolean isValidUser(String inputEmail, String inutPass, Integer inputToken, Integer generagedToken){
        for (Client client : clients) {
            Boolean isTokenValid = generagedToken.equals(inputToken);
            Boolean isUserValid = inputEmail.equalsIgnoreCase(client.getEmail());
            Boolean isValidPass = inutPass.equalsIgnoreCase(client.getPass());

            if (isTokenValid && isUserValid && isValidPass) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public void register(){
        System.out.println("Menu de registro de cliente: ");
        String inputEmail = fillStringData("\nIngrese un email: ", read);
        String inutPass = fillStringData("\nIngrese una contraseña: ", read);
        String inutName = fillStringData("\nIngrese su nombre: ", read);
        String inputLastname = fillStringData("\nIngrese su apellido: ", read);
        Integer inputDni = fillDniData("\nIngrese su DNI sin puntos: ", read);

        int index = 0;
        for (Client client: clients){
            if (client == null){
                Client newClient = new Client(inutPass, inputEmail);
                newClient.setDni(inputDni);
                newClient.setName(inutName);
                newClient.setLastname(inputLastname);
                clients[index] = newClient;
                System.out.println("Se registro exitosamente, sera redirigido al menu de login.");
                start();
                break;
            }
            index++;
        }
    }
}