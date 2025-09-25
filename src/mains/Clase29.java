package mains;

import mains.calse21.Alumno;
import mains.calse21.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Clase29 {
    static void main() {

        List<Integer> numeros = List.of(12,5,4,54,7,15,78,52,789,21);
        List<String> nombres  = List.of("nESTOR", "mARIA", "Martin", "Jouse",
                "Marcos", "Pilar", "Garen", "Irealia", "Coffe", "Marico", "Mavetina", "Negrita");

        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Jose", "Marciano", 54664545, "Calle siempre viva 1234"));
        alumnos.add(new Alumno("Cristian", "Merengue", 3456345, "Calle siempre tuerta 324523"));

        alumnos.forEach( alumno -> System.out.println(alumno));

        List<Persona> personas = alumnos.stream().map(alumno -> new Persona(alumno.getNombre(), alumno.getApellido())).collect(Collectors.toList());
        IO.println("\n\n##### PERSONAS ####");
        personas.forEach( p -> System.out.println(p));

        List<Persona> personasEnMasDeUnLinea = alumnos.stream().map(alumno -> {

           Persona persona = new Persona(alumno.getNombre(), alumno.getApellido());
           persona.setEstaVivo(Boolean.TRUE);
           return persona;
        }).collect(Collectors.toList());

        System.out.println("\n\n##### PERSONAS en mas de una linea####");
        personasEnMasDeUnLinea.forEach( p -> System.out.println(p));
        //nombres.remove(1);

        Integer sumatoria = numeros.stream().reduce(0,  (numero, acumulador) -> {
            int temp = numero + acumulador;
            System.out.println(String.format("Temporal: %d + %d = %d", numero, acumulador, temp));
            return  temp;
        });

        System.out.println("La lista tiene una sumatoria total de: " + sumatoria);

//        List<Integer> parNumeros = numeros.stream().filter( numero -> {
//            IO.println("el numero: " + numero);
//            return numero % 2 == 0;
//        }).collect(Collectors.toList());

        List<Integer> parNumeros = numeros.stream().filter( numero -> numero % 2 == 0).collect(Collectors.toList());

        IO.println("La lista filtrada: " + parNumeros);
    }
}
