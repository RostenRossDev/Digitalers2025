package mains;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clase4 {
    public static void main(String[] args) {

        //FOR
        System.out.println("Ingrese la tabla de multiplicar que desea ver: " );
        Scanner scanner = new Scanner(System.in);
        int multiplicador = scanner.nextInt();

        for(int i = 0; i < 11; i++){
            if(i != 0){
                int valor = i * multiplicador;
                System.out.println(String.format("%d X %d = %d", multiplicador, i, valor));
            }

            if (i == 6){
                //break;   //Sale del bucle, lo rompe
                continue; //Se saltea el recorrido actual.
            }
            System.out.println("--------------------");
        }


        List<String> miLista = new ArrayList<>();

        miLista.forEach(elemento -> System.out.println(elemento));

        for(String elemento: miLista){
            System.out.println(elemento);
        }

        Clase5.saludar("Hola usando un metodo estatico de la clase5 dentro de la clase4");
        //forma incorrecta, esta bine pero no tan bien.
//        for(int i = 1; i < 11; i++){
//            int valor = i * multiplicador;
//            System.out.println(String.format("%d X %d = %d", multiplicador, i, valor));
//        }




        //WHILE Y DO WHILE
//        System.out.println("Ingrese la tabla de multiplicar que desea ver: " );
//
//        int multiplicador = scanner.nextInt();
//
//        System.out.println("Indique la longitud de la tabla: " );
//        int limiteDeMultiplicando = scanner.nextInt();
//
//        int multiplicando = 0;
//
//        while (multiplicando < limiteDeMultiplicando) {
//            multiplicando++;
//            int valor = multiplicando * multiplicador;
//            System.out.println(String.format("%d X %d = %d", multiplicador, multiplicando, valor));
//        }
//
//
//
//        int continua;
//
//        do{
//            System.out.println("Ingrese el primer numero de la suma: " );
//            int num1 = scanner.nextInt();
//
//            System.out.println("Ingrese el segundo numero de la suma: " );
//            int num2 = scanner.nextInt();
//
//            System.out.printf("%d + %d = %d", num1, num2, num1+num2);
//            //System.out.println(String.format("%d + %d = %d", num1, num2, (num1+num2)));
//            System.out.println("Desea sumar otros numeros:  0 para terminar");
//            continua = scanner.nextInt();
//        }while (continua != 0);
    }
}
