package mains;

import mains.clase24.*;
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

        String priemrApellido3 = apellidos.poll(); // Poll me devuelve el primer elemento de la cola
        //pero tambien lo elimina de la misma.

        System.out.println("\ncola: " + apellidos);

        Queue<Integer> edades = new PriorityQueue();

        Integer miEdad = edades.peek();
        //miEdad2 = edades.element();
        //int miEdad3 = edades.peek();


        // cola de prioridad


        PriorityQueue<Tarea> colaTareas = new PriorityQueue<>();

        // Agregar tareas con diferentes prioridades
        colaTareas.add(new Tarea("Hacer informe", 2));
        colaTareas.add(new Tarea("Reunión urgente", 1));
        colaTareas.add(new Tarea("Leer emails", 3));
        colaTareas.add(new Tarea("Llamar a cliente", 1));

        System.out.println("Tareas procesadas por orden de prioridad:");
        while (!colaTareas.isEmpty()) {
            System.out.println("• " + colaTareas.poll());
        }


        //Pilas y colas en una sola estructura

        Deque<String>  pila = new ArrayDeque<>();


        Map<String, Integer> nobmreEdades = new HashMap<>();
        nobmreEdades.put("yo", 2);
        nobmreEdades.put("y1", 423);
        nobmreEdades.put("ya", 12);
        nobmreEdades.put("yi", 1);
        nobmreEdades.put("yo", 5);
        nobmreEdades.put("asdas", 15);

        System.out.println("mi valor es: " + nobmreEdades.get("yo"));
        System.out.println("tengo elementos: " + nobmreEdades.size());
        System.out.println("contiene clave 'ya'? : " + nobmreEdades.containsKey("ya"));
        System.out.println("contiene clave 'yo'? : " + nobmreEdades.containsKey("yo"));
        System.out.println("Todos los valores de mi Map: " + nobmreEdades.values());
        System.out.println("Todos las key de mi Map: " + nobmreEdades.keySet());

        Map<String, Integer> nobmreEdadesLinkeados = new LinkedHashMap<>();
        SortedMap<String, Integer> asdas;

        TreeMap adas;


        // usando iterador en mapas

        Iterator<String> clavesIterador = nobmreEdades.keySet().iterator();

        while (clavesIterador.hasNext()){
            String claveTemporal = clavesIterador.next();
            System.out.println("El valor de la clave: " + claveTemporal + " ,Es : " + nobmreEdades.get(claveTemporal));
        }


        Nodo<String>  nodo1 = new Nodo<>("Nestor");
        Nodo<String>  nodo2 = new Nodo<>("Matias");
        nodo1.setSiguiente(nodo2);

        Nodo<String>  nodo3 = new Nodo<>("Cristina");
        nodo2.setSiguiente(nodo3);

        Nodo<String>  nodo4 = new Nodo<>("Marcos");
        nodo3.setSiguiente(nodo4);

        Nodo<String> nodoDeFin = new Nodo<>(null);
        nodo4.setSiguiente(nodoDeFin);

        Nodo<String> actual = nodo1;
        while (actual.getSiguiente() != null ){
            System.out.println("Nombre: " + actual.getValor());
            actual = actual.getSiguiente();
        }


        Lista<String> listaDeNombres = new Lista<>();
        System.out.println("Mi lista de nombres tiene " + listaDeNombres.getCantidad() + " elementos");

        listaDeNombres.agregarElemento(new Nodo<String>("Matilde"));
        listaDeNombres.agregarElemento(new Nodo<String>("Jose"));
        listaDeNombres.agregarElemento(new Nodo<String>("Ramon"));
        listaDeNombres.agregarElemento(new Nodo<String>("Coffee"));
        listaDeNombres.agregarElemento(new Nodo<String>("Blue"));

        System.out.println("MI lista: " + listaDeNombres);

        listaDeNombres.eliminarElemento(2);

        System.out.println("MI lista actualizada: " + listaDeNombres);

    }


}