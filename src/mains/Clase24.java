package mains;

import mains.clase24.DosAtributos;
import mains.clase24.GenericaDosAtributos;
import mains.enums.ColoresEnum;
import mains.enums.ColoresEnumMejorado;

import java.util.*;

public class Clase24 {
    public static void main(String[] args) {
        ColoresEnum[] enumerados = { ColoresEnum.VERDE, ColoresEnum.AMARILLO};

        System.out.println(ColoresEnum.VERDE.name());
        System.out.println(ColoresEnum.VERDE);
        System.out.println(ColoresEnum.VERDE.ordinal());
        System.out.println(ColoresEnum.VERDE.values()[3]);
        System.out.println(ColoresEnum.valueOf("VERDE"));
//        System.out.println(ColoresEnum.valueOf("ASDAS"));


        /*Enum mejorado*/

        System.out.println(ColoresEnumMejorado.ROJO.getHEX_CODE());
        System.out.println(ColoresEnumMejorado.ROJO.getNAME());

        ColoresEnumMejorado color = ColoresEnumMejorado.ROJO;
        System.out.println(color.ordinal());

        switch (color){
            case ROJO:
                System.out.println(color.ordinal());
                break;
            case VERDE:
                System.out.println(color.ordinal());
                break;
            default:
                System.out.println(color.ordinal());
        }


        Integer codigoEntero = 454545;
        Integer nroEntero= 362420321;

        String codigoString = "asdasd414545fg";
        String nroString = "362420321adas";

        DosAtributos att1 = new DosAtributos(codigoString, nroString);
        att1.setCodigo(4545);
        DosAtributos att2 = new DosAtributos(codigoEntero, nroEntero);


        GenericaDosAtributos<Integer, String> attGenerico1 = new GenericaDosAtributos<Integer, String>(357159, "jj123jhg");
        attGenerico1.getCodigo().shortValue(); //Tengo acceso a los metodos de un objeto ENTERO
        attGenerico1.getNumero().isEmpty();// Tengo acceso a los metodos de un objeto Stirng
//        attGenerico1.setCodigo("asdas");

        GenericaDosAtributos<String, String> attGenerico2 = new GenericaDosAtributos<String, String>("hjasdjh212", "jj123jhg");
        attGenerico2.getNumero().length();
        attGenerico2.getCodigo().length();
        attGenerico2.setCodigo("asdas");
//        attGenerico2.setCodigo(12312);

        List<String> palabras = new ArrayList<>(); // la mas usada
        List<String> palabras2 = new LinkedList<>(); // esta nunca la use (es mi apreciación personal)

        Set<Integer> numeros = new HashSet<>();
        Set<Integer> numeros2 = new LinkedHashSet<>();
        Set<Integer> numeros3 = new TreeSet<>();
        //((TreeSet) numeros).getLast();
        numeros = new LinkedHashSet<>();
        Collection<Integer> integers = new ArrayList<>();

        List<String> nombres = new ArrayList();
        nombres.add("Nestor");
        nombres.add("Matias");
        nombres.add("Jose");
        nombres.add( "Martin");

        System.out.println(nombres);


        Iterator<String> iterador = nombres.iterator();

        while (iterador.hasNext()){
            String elemento = iterador.next();
            if(elemento.equals("Jose")){
                iterador.remove();
            }
        }


        List<Integer> enteros = List.of(1,1,3,4,5,62,6,2,2,5,7);

        Set<Integer> enterosSinRepetir = new HashSet<>();

        for (Integer n : enteros){
            enterosSinRepetir.add(n);
        }

        System.out.println("enterosSinRepetir: " + enterosSinRepetir);



        for (int i = 0; i < 20; i++){
            Iterator<Integer> iteradorHashSet = enterosSinRepetir.iterator();
            System.out.println("elemento: " );
            while (iteradorHashSet.hasNext()){
                Integer elemento = iteradorHashSet.next();
                System.out.print(elemento + ", ");
            }
        }


        Queue<String> apellidos = new ArrayDeque<>();
        apellidos.offer("asdas");
        apellidos.offer("fgdf");
        apellidos.offer("2323sad");

        System.out.println("\ncola: " + apellidos);

        String priemrApellido = apellidos.element(); //Sirve para obtener el priemr elemento de la cola, pero no lo elimina de la misma,
        // en caso de que la coleccion este vacia lanza una excepcion.


        String priemrApellido2 = apellidos.peek(); //Peek sirve para lo mismo que element pero en caso de
        // que la coleccion este vacia estaretorna null


        Queue<Integer> edades = new PriorityQueue();

        Integer miEdad = edades.peek();
        //miEdad2 = edades.element();
        //int miEdad3 = edades.peek();

    }
}