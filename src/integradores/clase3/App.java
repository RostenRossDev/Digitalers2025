package integradores.clase3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String validUser = "administrador";
        String validPass = "administrador.1234";
        Character reTryNo = 'N';
        //mostrar un mensaje solicitando el usuario
        System.out.println("Bienvenido a Online  Banking, por favor ingrese las credenciales solicitadas: ");
        Integer token = (int) (Math.random()*1000000);
        System.out.printf("\nClave token generada automaticamente: %d ", token);

        // bucle for

        for (int i = 0; i < 3; i++) {
            //capturar usurio
            String inputUser = fillStringData("\nUsuario: ", leer);
            String inutPass = fillStringData("\nContraseña: ", leer);
            Integer inputToken = fillIntegerData("\nClave token: ", leer);
            //verificar si los datos son validos

            //validUser.equalsIgnoreCase(inputUser)
            Boolean isTokenValid = token.equals(inputToken);
            Boolean isUserValid = inputUser.equalsIgnoreCase(validUser) ? Boolean.TRUE : Boolean.FALSE;
            Boolean isValidPass =  validPass.equals(inutPass) ? Boolean.TRUE : Boolean.FALSE;

            //&& Y logico o AND
            if(isTokenValid && isUserValid && isValidPass) {
                System.out.println("\nCredenciales Correctas, Bienvenido al Online Backing.");
                break;
            }else {
                System.out.println("\nError de credenciales... Desea intentarlo nuevamente= (S/N): ");
                Character reTry = leer.next().charAt(0);
                if(reTryNo.equals(reTry)){
                    System.out.println("Gracias por utilizar el Online Backing.");
                    break;
                }
            }
        }

        Integer index = 0;
        do {
            index++;
            //capturar usurio
            String inputUser = fillStringData("\nUsuario: ", leer);
            String inutPass = fillStringData("\nContraseña: ", leer);
            Integer inputToken = fillIntegerData("\nClave token: ", leer);
            //verificar si los datos son validos

            //validUser.equalsIgnoreCase(inputUser)
            Boolean isTokenValid = token.equals(inputToken);
            Boolean isUserValid = inputUser.equalsIgnoreCase(validUser) ? Boolean.TRUE : Boolean.FALSE;
            Boolean isValidPass =  validPass.equals(inutPass) ? Boolean.TRUE : Boolean.FALSE;

            //&& Y logico o AND
            if(isTokenValid && isUserValid && isValidPass) {
                System.out.println("\nCredenciales Correctas, Bienvenido al Online Backing.");
                break;
            }else {
                System.out.println("\nError de credenciales... Desea intentarlo nuevamente= (S/N): ");
                Character reTry = leer.next().charAt(0);
                if(reTryNo.equals(reTry)){
                    System.out.println("Gracias por utilizar el Online Backing.");
                    break;
                }
            }
        } while (index < 3);


//        if(token == inputToken) {
//            if(inputUser.equalsIgnoreCase(validUser)) {
//                if (validPass.equals(inutPass)) {
//                    System.out.println("Credenciales Correctas, Bienvenido al Online Backing.");
//                } else {
//                    System.out.println("Error de credenciales... Desea intentarlo nuevamente= (S/N): ");
//                    reTry = leer.next().charAt(0);
//                }
//            }else {
//                System.out.println("Error de credenciales... Desea intentarlo nuevamente= (S/N): ");
//                reTry = leer.next().charAt(0);
//            }
//        }else {
//            System.out.println("Error de credenciales... Desea intentarlo nuevamente= (S/N): ");
//            reTry = leer.next().charAt(0);
//        }

    }

    static public String fillStringData(String message,Scanner leer){
        System.out.println(message);
        return  leer.nextLine();
    }

    static public Integer fillIntegerData(String message,Scanner leer){
        //mostrar un mensaje solicitando el token
        System.out.println(message);
        return leer.nextInt();
    }
}
