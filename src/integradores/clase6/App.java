package integradores.clase6;

import integradores.clase6.entities.Client;
import integradores.clase6.start.HomeBanking;

import java.util.Scanner;

public class App {


    private static String exitMessage = "Gracias por utilizar el Online Backing.";

    public static void main(String[] args) {
//        HomeBanking home = new HomeBanking();
//        home.execute();
        Client c = new Client("asdas", "asdas");

    }











    static public void inicio(Integer[] tokens, Integer index, Scanner leer, Character reTryNo,  Character reTrySi){
//
//        //verificar si los datos son validos
//
//
//        Boolean isInputValid = login(inputUser, inutPass, inputToken, token);
//
//        //&& Y logico o AND
//        if(isInputValid) {
//            System.out.println("\nCredenciales Correctas, Bienvenido al Online Backing.");
//        }else {
//            if(!(index < 3)){
//                System.out.println(exitMessage);
//            } else {
//                System.out.println("\nError de credenciales... Desea intentarlo nuevamente= (S/N): ");
//                Character reTry = leer.next().charAt(0);
//                if (reTryNo.equals(reTry)) {
//                    System.out.println(exitMessage);
//                } else if (reTrySi.equals(reTry)) {
//                    leer.nextLine(); //Para limpiar un saldo de linea que se genera al ingresar el token previo
//                    inicio(tokens, index, leer, reTryNo, reTrySi);
//                }
//            }
//        }
    }
}