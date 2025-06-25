package integradores.clase6.util;

import integradores.clase6.entities.Account;
import integradores.clase6.entities.Client;
import integradores.clase6.start.HomeBanking;

import java.util.Arrays;
import java.util.Objects;

public class GenerateRandomNumber {

    public static Long generateCBU(){
        Long cbu = null;

        do{
            cbu = ((Double)(Math.random()*1000000)).longValue();
        }while (!validateToken(cbu));
        System.out.printf("\nClave token generada automaticamente: %d ", cbu);
        return cbu;
    }

    public static Boolean validateToken(Long cbu){
        for (Client client : HomeBanking.clients) {
            if(client != null){
                Account account =  client.getAccount();
                if (client != null && account != null && Objects.equals(cbu, account.getCbu())){
                    return Boolean.FALSE;
                }
            }
        }
        return Boolean.TRUE;
    }
}
