import java.util.Scanner;

public class Clase3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad: " );

        int edad = scanner.nextInt();

//        if(edad > 0 && edad < 11) {
//            System.out.println("Usted es un infante");
//        }else if(edad >= 11 && edad < 18){
//            System.out.println("Usted es un adolescente");
//        } else if (edad > 17 && edad < 65) {
//            System.out.println("Usted es un adulto joven");
//        }  else if (edad > 64) {
//            System.out.println("Usted es un adulto mayor");
//        }else {
//            System.out.println("No existen las edades negativas");
//        }
//
//        System.out.println("Fin de programa con estructura IF.");

        System.out.println("Inicio de programa con estructura SWITHC.");

        switch (edad){
            case 11 :
                System.out.println("Usted es un infante");
                break;
            case 18:
                System.out.println("Usted es un adulto joven");
                break;
            case 65:
                System.out.println("Usted es un adulto mayor");
                break;
            default:
                System.out.println("No tengo una respuesta para su edad.");
        }

    }
}
