public class Clase2 {
    public static void main(String[] args) {

        //Casteo es convertir un tipo de dato a otro compatible

        int numeroEntero = 2;
        double numeroDecimal;

        numeroDecimal = numeroEntero; // 2 -> 2,00

        System.out.println("Valor decimal luego del casteo implicito: " + numeroDecimal);
        double numeroDecimalGrande = 25.56455555555555d;
        int numeroGrande = (int) numeroDecimalGrande;

        System.out.println("Valor entero luego del casteo explicito: " + numeroGrande);


        int miInt2 = (int) 92;
        char miChar = (char) miInt2;

        System.out.println("Caracter '" + miChar + "' del numero " + miInt2);


        // Strings

        char[] charArray = new char[10];
        charArray[0] = 'H';
        charArray[1] = 'o';
        charArray[2] = 'l';
        charArray[3] = 'a';
        charArray[4] = ' ';
        charArray[5] = 'M';
        charArray[6] = 'u';
        charArray[7] = 'n';
        charArray[8] = 'd';
        charArray[9] = 'o';

        String frace = "Hola Mundo";

        frace.charAt(3);
        Boolean contieneMundo = frace.contains("Mundo");
        System.out.println("La frace contiene 'mundo' ?: " + contieneMundo);

        Boolean contiene = frace.contains(" mun");
        System.out.println("La frace contiene ' Mun' ?: " + contiene);

        Boolean contieneZ = frace.contains("z");
        System.out.println("La frace contiene 'z' ?: " + contieneZ);

        String frace2 = frace + " lindo martes.";

        String frace3 = frace.concat(" lindo martes.");

        System.out.println("La frace2 : " + frace2);
        System.out.println("La frace3 : " + frace3);

        Boolean terminaConMundo = frace.endsWith("Mundo");
        Boolean terminaCon_mundo = frace.endsWith("mundo");
        Boolean terminaConO = frace.endsWith("O");
        Boolean terminaCon_o = frace.endsWith("o");

        System.out.println("terminaConMundo : " + terminaConMundo);
        System.out.println("terminaCon_mundo : " + terminaCon_mundo);
        System.out.println("terminaConO : " + terminaConO);
        System.out.println("terminaCon_o : " + terminaCon_o);

        String objeto1 = "Hola ";
        String objeto2 = " Mundo ";
        String objeto3 = objeto1;
        String objeto4 = "  lindo martes";
        Boolean sonIguales = objeto1.equals(objeto3);
        System.out.println("Son iguales el objeto1 y el objeto3: " + sonIguales);

        System.out.println("Contiene la palabra 'hola': " + objeto1.equalsIgnoreCase("hola"));
        System.out.println("Contiene la palabra 'ho2la': " + objeto1.equalsIgnoreCase("ho2la"));
        System.out.println("Contiene la palabra 'H': " + objeto1.equalsIgnoreCase("H"));
        System.out.println("Contiene la palabra 'h': " + objeto1.equalsIgnoreCase("h"));

        String mensaje = "Ocurrio un error en el hilo %s debido a que la variable dividendo era %d.";
        System.out.println(String.format(mensaje, "Hilo principal: 5", 0));

        System.out.println(String.format("Ocurrio un error en el hilo %s debido a que la variable dividendo era %d.", "Hilo principal: 5", 0));


        System.out.println("La primer letra o se encuentra en el indice: " + frace.indexOf('o'));
        System.out.println("La primer letra u se encuentra en el indice: " + frace.indexOf('u'));
        System.out.println("La primer letra z se encuentra en el indice: " + frace2.indexOf('z'));

        System.out.println("La ultima letra o se encuentra en el indice: " + frace.lastIndexOf('o'));
        System.out.println("La ultima letra u se encuentra en el indice: " + frace.lastIndexOf('u'));
        System.out.println("La ultima letra z se encuentra en el indice: " + frace.lastIndexOf('z'));

        System.out.println("Esta vacio: " + frace.isEmpty());
        System.out.println("Esta vacio: " + " ".isEmpty());
        System.out.println("Esta vacio: " + "".isEmpty());
        System.out.println("Esta vacio: " + " ".isBlank());

        System.out.println("Esta frace tiene : " + frace.length() + " caracteres");


        System.out.println("Join de objeto1 con objeto2 : " + String.join(" ", objeto2, objeto4, "martin ", " marcos ", "mirta ", " maria"));

        System.out.println(frace.replace("Mundo", "Digitalers"));
        System.out.println(frace);

        Boolean verdadero = true; // "true"
        char caracter = 'd'; // "d"
        int numeroCinco = 5; // "5"
        System.out.println(String.valueOf(verdadero));
        System.out.println(String.valueOf(numeroCinco));
        String numeroStr = numeroCinco + "";
        String numeroStr2 = String.valueOf(numeroCinco);


        String valor1 = "hola";
        String valor2 = "holas";
        String valor3 = valor1;
        Integer valor4 = 5;
        Integer valor5 = 6;
        Integer valor7 = 5;

        System.out.println(valor1 == valor2);
        System.out.println(valor1 == valor3);
        System.out.println(valor1.equals(valor2));
        System.out.println(valor1.equals(valor3));

        System.out.println(valor4 == valor5);
        System.out.println(valor4.equals(valor5));
        System.out.println(valor4 == valor7);
        System.out.println(valor4.equals(valor7));


        // Math

        System.out.println("Numero E: " + Math.E);
        System.out.println("Numero PI: " + Math.PI);

        System.out.println("Methodo ABS: " + Math.abs(-6)); // devuelve siempre positivo
        System.out.println("Methodo ABS: " + Math.abs(-6.5f)); // devuelve siempre positivo

        System.out.println("Arco coseno: " + Math.acos(-6.5f));
        System.out.println("Arco coseno: " + Math.acos(6.5f));
        System.out.println("Arco coseno: " + Math.acos(0.5f));
        System.out.println("Arco coseno: " + Math.acos(-0.5f));

        System.out.println("Arco SENO: " + Math.asin(-0.5f));
        System.out.println("Arco SENO: " + Math.asin(0.5f));
        System.out.println("Arco SENO: " + Math.asin(2));

        //System.out.println("AddExact: " + Math.addExact(Integer.MAX_VALUE, 1));
        System.out.println("AddExact: " + Math.addExact(2147483647L, 1L));
        //System.out.println("AddExact: " + Math.addExact(Long.MAX_VALUE, 1L));

    }
}
