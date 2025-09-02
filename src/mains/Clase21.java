package mains;

import mains.calse21.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Clase21 {

    static String version;

    static { // Se ejecuta UNA SOLA VEZ  y es cuando se carga la clase
        version =  "1.0";
    }

    public static void main(String[] args) {

//        Materia fisica1 = new Materia("Fisica 1");
        Materia fisica1 = new Materia();
        Materia quimica = new Materia();
        fisica1.setNombre("Fisica 1");
        Alumno asdasd = new Alumno("Manuel", "Pereira");

       Alumno pepe = new Alumno("Pepe", "Argento");
       Alumno al2 = new Alumno("Jose", "VALENCIA");
       pepe.setDni(2165);
       al2.setDni(3454534);

        System.out.println("Dni pepe: " + pepe.getDni());
        ;

        System.out.println("Dni alumno2: " + al2.getDni());

        System.out.println("Carreras que poseen las materias: " + Materia.carreras);


//        Auto a1 = new Auto("vmw", "asd134a");
//        Auto a2 = new Auto("for", "4444");
//
//        System.out.println(a1);
//        System.out.println(a2);
 //       System.out.println(Auto.concesionaria);

        System.out.println(Auto.getConsecionaria());
        Auto.renameConcesionaria("nueva consecionaria");
        System.out.println(Auto.getConsecionaria());

//        System.out.println(pepe);
//        System.out.println(al2);

        Byte num =  Byte.valueOf("25");
        System.out.println("string a integer: " + num);

        Integer charInt =  Character.getNumericValue('h');
        System.out.println("charInt: " + charInt);

//        Persona p = new Persona("nestor", "costantini");
        Alumno a = new Alumno("nestor", "costantini");
        a.getDni();

        Profesor pr = new Profesor("marcos", "costantini", "filosofia");
        pr.getMateria();

        Persona personaAlumno = new Alumno("nestor", "costantini", 5545);
        System.out.println("Dni del alumno: " + ((Alumno) personaAlumno).getDni());
        Alumno alum = (Alumno) personaAlumno;
//        Profesor profe= (Profesor) personaAlumno;

//        System.out.println("alumno en forma de profesor: " + ((Profesor) personaAlumno).getMateria());

        Persona personaProfesor = new Profesor("matias", "costantini", "programacion");
        System.out.println("Materia del profesor: " + ((Profesor) personaProfesor).getMateria());;
        Profesor profe2= (Profesor) personaProfesor;

//        Alumno alum2= (Alumno) personaProfesor;

        List<String> nombres = Arrays.asList("Nestor","Matias", "Marcos");
        String[] nombresArray = {"Nestor","Matias", "Marcos"};

        for (String item : nombresArray){
            System.out.println(item.toUpperCase());
        }

    }
}