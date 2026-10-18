package Level1.Switch;

import java.util.Scanner;

/**
 * Clase Menú que se repite hasta elegir "Salir"
 * 
 * @author Moisés
 * @version 1.0
 */

public class Ejercicio70 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int op;

        do {

            System.out.println("Elige una opción" + "\n" +
                    "1. Hola Mundo" + "\n" + "2. Salir");

            op = entrada.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Hola Mundo");
                    break;
                case 2:
                    System.out.println("Saliendo ...");
                    break;
                default:
                    System.out.println("Opción invalida");
                    break;
            }

        } while (op != 2);

    }
}
