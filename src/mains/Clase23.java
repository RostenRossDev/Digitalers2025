package mains;

import integradores.clase6.exceptions.NotExistClientException;
import mains.calse21.*;
import mains.exceptions.DivisionPorCeroException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.NotActiveException;
import java.rmi.NotBoundException;
import java.util.Arrays;
import java.util.List;

public class Clase23 {
    public static void main(String[] args) {

        System.out.println("Inicio de programa");

        Integer division = null;
        int a = 3;
        int b = 0;





        try {
            division = dividir(a,b);
        } catch (ArithmeticException e) {
            System.out.println("error: " + e.toString());
            System.out.println("class: " + e.getClass());
            System.out.println("msg: " + e.getMessage());
            System.out.println("cause: " + e.getCause());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        } finally {
            //siempre se ejecuta
            //generalmente se usa para liberar recursos
            System.out.println("Liberando recursos de la memoria....");
        }
        System.out.println("La division entre 3/1 es : " + division);

        System.out.println("Fin de programa");


        FileReader lector = null;
        try {
            lector = new FileReader("C:\\Users\\Rosten\\Documents\\prueba.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(lector);


        try {
            division = dividir(a,b);
        } catch (NotExistClientException e) {
            throw new RuntimeException(e);
        } catch (NotActiveException e) {
            throw new RuntimeException(e);
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e){

        }


        try {
            System.out.println("Division mejorada: " + dividirMejorado(a, b));
        } catch ( DivisionPorCeroException e){
            e.printStackTrace();
        }

        try {
            FileReader reader =  new FileReader("C:\\Users\\Rosten\\Documents\\prueba.txt");

            FileReader reader2 = cargarArchivo("C:\\Users\\Rosten\\Documents\\prueba.txt");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static Integer dividir(Integer a, Integer b) throws ArithmeticException, NotExistClientException, NotActiveException, NotBoundException, Exception {
        Integer result  =a/b;
        System.out.println("El resultado es: " + result);
        return result;
    }

    public static Integer dividirMejorado(Integer a, Integer b) throws ArithmeticException{
        if(b == 0){
            throw new DivisionPorCeroException("No es posible la division por cero", a);
        }

        return a/b;
    }



    public static FileReader cargarArchivo(String ruta) throws FileNotFoundException {
        FileReader reader =  new FileReader(ruta);
        return reader;
    }

}