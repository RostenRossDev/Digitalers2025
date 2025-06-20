package integradores.clase6.util;

import integradores.clase6.entities.Client;

import java.util.Arrays;

public class GenerateRandomNumber {

    public static Long generateCBU(Client[] clients){
        Long cbu = null;
        int count = clients.length;


        do{
            cbu = (int) (Math.random()*1000000);

        }while (!validateToken(tokens, index, cbu));

        tokens[index] = cbu;
        System.out.printf("\nClave token generada automaticamente: %d ", cbu);
        return cbu;
    }
}
