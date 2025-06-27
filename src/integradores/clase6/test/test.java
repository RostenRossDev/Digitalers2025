package integradores.clase6.test;

import integradores.clase6.entities.Client;

public class test {

    public static void main(String[] args) {

        for (int i = 0; i < 100000; i++) {
            testGenerateRecoveryTokenResultOk();
        }

    }

    public static void testGenerateRecoveryTokenResultOk(){
        Integer token = Client.generateRecoveryToken();
        assert  token > 0 : "El token debe ser menor a 0";

        assert token.toString().length()  == 4 : "El token como maximo debe tener uan longitud de 4 digitos";

        assert  tieneCaracteresRepetidos(token) == Boolean.FALSE : "No deben repetirse caracteres";
    }

    public static boolean tieneCaracteresRepetidos(int numero) {
        String s = String.valueOf(numero);

        return s.charAt(0) == s.charAt(1) ||
                s.charAt(0) == s.charAt(2) ||
                s.charAt(0) == s.charAt(3) ||
                s.charAt(1) == s.charAt(2) ||
                s.charAt(1) == s.charAt(3) ||
                s.charAt(2) == s.charAt(3);
    }
}
