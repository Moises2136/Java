package Level1.Switch;

import java.util.Scanner;

/**
 * Clase Vocal o consonante
 * 
 * @author Moisés
 * @version 1.0
 */

public class Ejercicio64 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una letra: ");

        String vo_con = entrada.nextLine();

        switch (vo_con) {
            case "a":
                System.out.println("Tu letra " + vo_con + " es una vocal");
                break;
            case "e":
                System.out.println("Tu letra " + vo_con + " es una vocal");
                break;
            case "i":
                System.out.println("Tu letra " + vo_con + " es una vocal");
                break;
            case "o":
                System.out.println("Tu letra " + vo_con + " es una vocal");
                break;
            case "u":
                System.out.println("Tu letra " + vo_con + " es una vocal");
                break;
            default:
                System.out.println("Tu letra " + vo_con + " es una consonante");
                break;
        }
    }
}
