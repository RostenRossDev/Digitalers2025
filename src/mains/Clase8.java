package mains;

import integradores.clase6.entities.Account;
import mains.objetosDelaClase8.Lista;

import java.util.*;

public class Clase8 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        System.out.println("Cantida de elementos: " + palabras.size());
        palabras.add("adasdas");
        palabras.add("adasdas");
        palabras.add("adasdas");
        System.out.println(palabras);
        System.out.println("Cantida de elementos: " + palabras.size());
        //palabras.remove(0);
        //System.out.println("Cantida de elementos: " + palabras.size());

        //System.out.println("Palabra en la posicion 3: " + palabras.get(3));

        //List<String> palabrasLinked = new LinkedList<>();

        Set<String> palabrasNoRepetibles = new HashSet<>(palabras);
        System.out.println(palabrasNoRepetibles);



        Set<String> palabrasNoRepetibles2 = new LinkedHashSet<>();

        Queue<String> priorityQueue = new LinkedList<>();

        //palabrasLinked.add("adasdas");

        Account acount1 = new Account();
        Account acount2 = new Account();
        Account acount3 = new Account();



        Map<String, Account> acountsMap = new HashMap<>();
        acountsMap.put("cuenta1", acount1);
        acountsMap.put("2", acount2);
        acountsMap.put("adas", acount3);

       Account ac =  acountsMap.get("2");


    }
}
