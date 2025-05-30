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

    }
}
