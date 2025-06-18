package mains;

import mains.MyExceptions.DivisionPorCincoException;
import mains.objetoDeLaClase7.Cuadrado;
import mains.objetoDeLaClase7.Triangulo;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Clase7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Triangulo triangulo1 =  new Triangulo();

        Triangulo triangulo2 =  new Triangulo(25d);

        System.out.println("Triangulo 1: " + triangulo1.getArea());
        triangulo1.setBase(5D);
        triangulo1.setAltura(15D);

        System.out.println("Triangulo 1 tiene lados: " + triangulo1.getLados());
        System.out.println("Triangulo 2: " + triangulo2.getArea());


        triangulo1.setArea(2d);
        System.out.println("Triangulo 1: " + triangulo1.getArea());


        Cuadrado cuadrado1 = new Cuadrado();
        cuadrado1.setLargoDelLado(12.6D);

        System.out.println("Cuadrado 1: " + cuadrado1.getArea());

        cuadrado1.setArea(5D);
        System.out.println("Cuadrado 1: " + cuadrado1.getArea());

        System.out.println("Cuadrado 1 tiene lados: " + cuadrado1.getLados());
        System.out.println("Cuadrado 1 tiene area: " + cuadrado1.calcularArea());

        System.out.println("Triangulo 1 un area: " + triangulo1.calcularArea());

//        System.out.println("Ingrese el la base del triangulo 2: ");
//        triangulo2.setBase(scanner.nextDouble());
//        System.out.println("Ingrese el la altura del triangulo 2:");
//        triangulo2.setAltura(scanner.nextDouble());

//        System.out.println("Triangulo 2 un area: " + triangulo2.calcularArea());
//
//        System.out.println("la referencia del Triangulo2 : " + triangulo2);
//
//        FiguraGeometrica figura = new FiguraGeometrica();
//
//        Object obj = new Object(); // objeto mas simple de todos, es del cual todos los objetos heredan sin excepción
//

        System.out.println("Ingrese el dividor: ");
        int divisor = scanner.nextInt();

        System.out.println("Ingrese el dividendo: ");
        int dividendo = scanner.nextInt();


        //Excepciones no comprobadas o excepciones en tiempo de ejecucion
        try {
          if (divisor == 5) {
              System.out.println("No hacemos nada xq la division por cinco no es posible");
              throw new DivisionPorCincoException();
          } else {
              System.out.println(dividendo / divisor);
          }
        }catch (DivisionPorCincoException e){
           e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }


        try {
            System.out.println(dividendo/divisor);
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Saliendo del programa");

        //Excepcion comprobadas
        try {
            List<String> lineas = Files.readAllLines(Paths.get("archivo.txt"));
            for (String linea : lineas) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }finally {
            System.out.println("Simpre me ejecuto, no importa que suceda, generalmente soy utilizado para liberar recursos");
        }
    }
}
