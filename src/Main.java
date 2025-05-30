//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        final Double PI = 3.141592654;

        //primitivos
        //entero
        byte numeroMuyPequenio = 127;
        short numeroPequenio = 32767;
        int cajaNumeroUno = 2_147_483_646;
        long numeroGrande = 922_337_203_685_477_580l;
        long sumaDeIntConLong = cajaNumeroUno + numeroGrande;
        System.out.println("sumaDeIntConLong " + sumaDeIntConLong);

        //decimales
        float decimal = 1.5f;
        double doble = 1.2;
        double doble2 = 1.2d;
        //char o caracter
        char letraA = 'c';
        //booleanos
        boolean verdadero = true;
        boolean falso = false;

        //Objetos
        Byte NumeroEnteroMuyPequenioObj = 14;
        Short NumeroEnteroPequenioObj = 3276;
        Integer NumeroEnteroNormalObj = 14;
        Float flotanteObj = 15.2f;
        Double  dobleObj = 85.225;

        //Char o caracter
        Character caracter = 'c';

        //String o palabras o cadenas
        String miNombre = "Me llamo nestor matias";

        //Booleanos verdaderos o falsos
        Boolean falsoObj = Boolean.FALSE;
        Boolean verdaderoObj = Boolean.TRUE;

        //Arreglos o vectores
        int[] listaDeNumeros = new int[2];   // 0 , 1 , 2 ...
        listaDeNumeros[0] = 5;
        listaDeNumeros[1] = 6;
        System.out.println("listaDeNumeros: " + listaDeNumeros[0] + ", " + listaDeNumeros[1]);

        int[][] matriz = new int[2][5];
        matriz[0][0] = 1;
        matriz[0][1] = 1;
        matriz[0][2] = 1;
        matriz[0][3] = 1;
        matriz[0][4] = 1;

        matriz[1][0] = 5;
        matriz[1][1] = 2;
        matriz[1][2] = 8;
        matriz[1][3] = 8;
        matriz[1][4] = 8;
       /*
        1 1 1 1 1
        5 2 8 8 8
        */
        int[][][] cubo = new int[2][5][3];
        //System.out.println("Son iguales? : " + cajaNumeroUnooObj.equals(cajaNumeroDosObj));

        int[] vec = {150,500,3,4,5,6};

        //Operaciones Mateticas

        // + (SUMA)
        int suma1 = 5 + 6;
        System.out.println("suma1 = " + suma1);

        // - (RESTA)
        int suma2 = 5 + (- 6); //una no es nada mas que la SUMA un numero positivo con uno negativo
        int resta1 = 5 - 6;
        System.out.println("suma2 = " + suma2);
        System.out.println("resta1 = " + resta1);

        // * (MULTIPLICACION)
        int multiplicacion1 = 2 * 6;
        int multiplicacion2 = 2 * (-6);
        System.out.println("multiplicacion1 = " + multiplicacion1);
        System.out.println("multiplicacion2 = " + multiplicacion2);

        // DIVISION (/)
        int division1 = 15 / 3;
        int division2 = 15 / 2;
        System.out.println("division1 = " + division1);
        System.out.println("division2 = " + division2);

        // DIVISION (/)
        int modulo1 = 15 % 3;
        int modulo2 = 15 % 2;
        System.out.println("modulo1 = " + modulo1);
        System.out.println("modulo2 = " + modulo2);

        //  operaciones booleanas
        //  &&  operacion AND   nos devuelve VERDADERO cuando ambas condiciones son verdaderas
        boolean isTrue = false && true && true && true && true && true && true;
        System.out.println("isTrue = " + isTrue);

        //  &&  operacion OR   nos devuelve VERDADERO cuando almenos una condiciones es verdadera
        boolean isFalse = false || false || false || false || false || false || true;
        System.out.println("isFalse = " + isFalse);

        boolean esPar = suma1 % 2 == 0;
        boolean esPositivo = suma1 > 0;
        boolean esNegativo = suma1 < 0;
        boolean esMayorOIgual = suma1 >= 0;
        boolean esMenorOIgual = suma1 <= 0;

        boolean existeMatriz = matriz != null;
        boolean matrisEsNulo = matriz == null;

        System.out.println("suma1 vale = " + suma1);
        System.out.println("esPar = " + esPar);

        System.out.println("suma1 es Positivo = " + esPositivo);
        System.out.println("suma1 es Negativo= " + esNegativo);
        System.out.println("suma1 es Mayor O Igual = " + esMayorOIgual);
        System.out.println("suma1 es Menor O Igual= " + esMenorOIgual);
        System.out.println("existe Matriz = " + existeMatriz);
        System.out.println("matris Es Nulo  = " + matrisEsNulo);


        //negacion en booleanos con el caracter !  invierte el resultado o niega la afirmacion
        boolean matrisEsNuloConNegacion = !(matriz == null);
        System.out.println("matris Es Nulo Con Negacion  = " + matrisEsNuloConNegacion);

        boolean esMayorOIgualConNegacion = !(suma1 >= 0);

        System.out.println("es Mayor O Igual Con Negacion  = " + esMayorOIgualConNegacion);


        //operaciones con asignacion
        int numerito = 10;
        System.out.println("numerito = " + numerito);
        numerito += 2;  //    numerito = numerito + 2
        System.out.println("nuevo valor de numerito = " + numerito);
        numerito -= 2;
        System.out.println("nuevo valor de numerito = " + numerito);
        numerito *= 2;
        System.out.println("nuevo valor de numerito = " + numerito);
        numerito /= 2;
        System.out.println("nuevo valor de numerito = " + numerito);
        numerito %= 2;
        System.out.println("nuevo valor de numerito = " + numerito);


        //Operador ternario o operador condicional
        boolean esMayorDeEdad =  25 > 18 ? true : false ;
        int esMayorDeEdadEnNumeros =  25 > 18 ? 1 : 0 ;
        String esMayorDeEdadEnTexto =  25 > 18 ? "Si" : "No" ;
        Character esMayorDeEdadEnCaracter =  25 > 18 ? 'S' : 'N' ;

        System.out.println("esMayorDeEdad = " + esMayorDeEdad);
        System.out.println("esMayorDeEdadEnNumeros = " + esMayorDeEdadEnNumeros);
        System.out.println("esMayorDeEdadEnTexto = " + esMayorDeEdadEnTexto);
        System.out.println("esMayorDeEdadEnCaracter = " + esMayorDeEdadEnCaracter);

//Operadores aplicados a bits

        int op1 = 16;      // 0001 0000 en binario
        int op2 = 2;       //10 en binario
        int result = op1 >> op2;
        System.out.println(result); // 4 (0000 0100)


        op1 = 16;       // 0000 0100 en binario
        op2 = 2;
        result = op1 << op2;
        System.out.println(result); // 16 (0001 0000)


        op1 = 6;       // 0110
        op2 = 3;       // 0011
        result = op1 & op2;
        System.out.println(result); // 2 (0010)


        op1 = 6;       // 0110
        op2 = 3;       // 0011
        result = op1 | op2;
        System.out.println(result); // 7 (0111)


        op1 = 6;       // 0110
        op2 = 3;       // 0011
        result = op1 ^ op2;
        System.out.println(result); // 5 (0101)


        op1 = 6;       // 0000 0000 0000 0000 0000 0000 0000 0110
        result = ~op1;
        System.out.println(result + ", en binario: " + Integer.toBinaryString(result)); // -7 (complemento a dos)

        //Operador de incremento
        int contador = 0;
        contador++;

        //Operador de decremento
        contador--;
    }
}