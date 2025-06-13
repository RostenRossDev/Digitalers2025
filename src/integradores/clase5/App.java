package integradores.clase5;

import java.util.Scanner;

public class App {

    private static String exitMessage = "Gracias por utilizar el Online Backing.";

    public static void main(String[] args) {

        Integer[] tokens = new Integer[3];
        Integer index = 0;

        Scanner leer = new Scanner(System.in);

        Character reTryNo = 'N';
        Character reTrySi = 'S';
        //mostrar un mensaje solicitando el usuario
        System.out.println("Bienvenido a Online  Banking, por favor ingrese las credenciales solicitadas: ");

        inicio(tokens, index, leer, reTryNo, reTrySi);

        // bucle for

//        for (int i = 0; i < 3; i++) {
//
//            Integer token =  generateToken(tokens, index);
//            index++;
//
//            //capturar usurio
//            String inputUser = fillStringData("\nUsuario: ", leer);
//            String inutPass = fillStringData("\nContraseña: ", leer);
//            Integer inputToken = fillIntegerData("\nClave token: ", leer);
//            //verificar si los datos son validos
//
//
//            Boolean isInputValid = login(inputUser, inutPass, inputToken, token);
//
//            //&& Y logico o AND
//            if(isInputValid) {
//                System.out.println("\nCredenciales Correctas, Bienvenido al Online Backing.");
//                break;
//            }else {
//                System.out.println("\nError de credenciales... Desea intentarlo nuevamente= (S/N): ");
//                Character reTry = leer.next().charAt(0);
//                if(reTryNo.equals(reTry)){
//                    System.out.println("Gracias por utilizar el Online Backing.");
//                    break;
//                }
//            }
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

    static public Integer generateToken(Integer[] tokens, Integer index){
        Integer token = null;
        do{
            token = (int) (Math.random()*1000000);

        }while (!validateToken(tokens, index, token));

       tokens[index] = token;
       System.out.printf("\nClave token generada automaticamente: %d ", token);
       return token;
    }

    static public Boolean validateToken(Integer[] tokens, Integer index, Integer generatedToken){

        for (int  i = 0; i< index;  i++) {
            if(tokens[i] == generatedToken) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    static public Boolean login(String inputUser, String inutPass, Integer inputToken, Integer validToken){
        String validUser = "administrador";
        String validPass = "administrador.1234";

        Boolean isTokenValid = validToken.equals(inputToken);
        Boolean isUserValid = inputUser.equalsIgnoreCase(validUser) ? Boolean.TRUE : Boolean.FALSE;
        Boolean isValidPass =  validPass.equals(inutPass) ? Boolean.TRUE : Boolean.FALSE;

        //&& Y logico o AND
        return isTokenValid && isUserValid && isValidPass;
    }

    static public void inicio(Integer[] tokens, Integer index, Scanner leer, Character reTryNo,  Character reTrySi){
        Integer token =  generateToken(tokens, index);
        index++;

        //capturar usurio
        String inputUser = fillStringData("\nUsuario: ", leer);
        String inutPass = fillStringData("\nContraseña: ", leer);
        Integer inputToken = fillIntegerData("\nClave token: ", leer);
        //verificar si los datos son validos


        Boolean isInputValid = login(inputUser, inutPass, inputToken, token);

        //&& Y logico o AND
        if(isInputValid) {
            System.out.println("\nCredenciales Correctas, Bienvenido al Online Backing.");
        }else {
            if(!(index < 3)){
                System.out.println(exitMessage);
            } else {
                System.out.println("\nError de credenciales... Desea intentarlo nuevamente= (S/N): ");
                Character reTry = leer.next().charAt(0);
                if (reTryNo.equals(reTry)) {
                    System.out.println(exitMessage);
                } else if (reTrySi.equals(reTry)) {
                    leer.nextLine(); //Para limpiar un salto de linea que se genera al ingresar el token previo
                    inicio(tokens, index, leer, reTryNo, reTrySi);
                }
            }
        }
    }
}