package integradores.clase6.util;

import integradores.clase6.entities.Account;
import integradores.clase6.entities.Client;
import integradores.clase6.exceptions.NotExistClientException;
import integradores.clase6.start.HomeBanking;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Menu {

    public static void accountMenu(String loginEmail, HomeBanking home){
        Scanner input = new Scanner(System.in);
        System.out.println("Para depositar dinero ingrese 1.");
        System.out.println("Para extraer dinero ingrese 2.");
        System.out.println("Para consultar su saldo ingrese 3.");
        System.out.println("Para volver al inicio del programa ingrese 4.");
        System.out.println("Para editar sus credenciales ingrese 5.");
        System.out.println("Para eliminar su cuenta ingrese 6.");
        System.out.println("Para cerrar el programa ingrese 7.");

        int op = input.nextInt();
        switch (op){
            case 1:
                accountDepositLogic(loginEmail, home);
                break;
            case 2:
                accountWithdrawLogic(loginEmail, home);
                home.start();
                break;
            case 3:
                printBalance(loginEmail, home);
                break;
            case 4:
                home.start();
                break;
            case 5:
                Client.updateCredential(loginEmail,  home);
                break;
            case 6:
                Client.deletCounnt(loginEmail,  home);
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("La opción \" " + op + "\" no es valida.");
                Menu.accountMenu(loginEmail, home);
        }
    }


    private static void accountDepositLogic(String loginEmail, HomeBanking home){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el monto a depositar: ");
        Double depositValue = input.nextDouble();
        input = new Scanner(System.in);
        try {
            Account.deposit(depositValue, loginEmail);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            System.out.println("Se deposito en su cuenta un saldo de $" + depositValue + " al dia de la fecha " + LocalDateTime.now().format(formatter));
            printBalance(loginEmail, home);
        }catch (NotExistClientException e){
            e.printStackTrace();
        }
    }

    private static void accountWithdrawLogic(String loginEmail,  HomeBanking home){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el monto a retirar: ");
        Double withdrawValue = input.nextDouble();
        try {
            if (Account.validateWithdraw(withdrawValue, loginEmail)){
                Account.withdraw(withdrawValue, loginEmail);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                System.out.println("Se retiro de su cuenta un saldo de $" + withdrawValue + " al dia de la fecha " + LocalDateTime.now().format(formatter));
                printBalance(loginEmail, home);
            }else {
                System.out.println("No posee suficiente saldo para esta operación.");
                printBalance(loginEmail, home);
            }
        }catch (NotExistClientException e){
            e.printStackTrace();
        }
    }

    private static void printBalance(String loginEmail, HomeBanking home){
        System.out.println("Su saldo actual es $: " + Account.getAccount(loginEmail).getBalance());
        Menu.accountMenu(loginEmail, home);
    }
}
