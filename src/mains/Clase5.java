package mains;

import java.util.Arrays;

public class Clase5 {

    public static void main(String[] args) {

        String[] nombres = new String[30];
       // System.out.println("El arreglo en la posicion 31" + nombres[31]);
        System.out.println("El arreglo tiene una longitud de " + nombres.length);

        for (String nombre :nombres){
            System.out.println("Se llama: ");
        }

        int[] numeros = {150,500,3,4,5,6};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Arreglo desde un fori: " + numeros[i]);
        }

        System.out.println("El arreglo de numeros tiene una longitud de " + numeros.length);

        //Arrays.stream(numeros).forEach(numero ->         System.out.println("numeros : " + numero));
        System.out.println("Arreglo original: " + Arrays.toString(numeros));
        numeros[0]= 1;
        numeros[1]= 34;
        numeros[2]= 191;
        numeros[3]= 9878;
        System.out.println("#########################");
        System.out.println("Arreglo actualizado: " + Arrays.toString(numeros));


        int[][] matriz = {{150,500,3,4,5,6}, {151,501,37,47,57} , {150,502,33,43,53,63}};
        System.out.println(matriz[1][1]);
        System.out.println(matriz[2][5]);
 //       {150,500,3, 4, 5, 6,}
 //       {151,501,37,47,57}
 //       {152,502,33,43,53,63}

        System.out.println("La matriz tiene una longitud de : " + matriz.length);

        System.out.println("Elemento de matriz: ");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" "+ matriz[i][j]);

            }
        }

        //procedimintos / metodos / funciones
        saludar("\nHola mundo");
        String saludo = mensajeParaSaludo("nestor");
        saludar(saludo);
        saludo ="";
    }

    public static void saludar(String mensaje){
        System.out.println(mensaje);
    }

    public static String mensajeParaSaludo(String nombre){
       return "Hola " + nombre;
    }
}
