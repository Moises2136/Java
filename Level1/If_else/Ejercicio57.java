package Level1.If_else;

import java.util.Scanner;

/**
 * Clase Calificación numérica a letra (A, B, C…)
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio57 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double calificacion = entrada.nextDouble();

        if (calificacion == 10) {
            System.out.println("Tu calificación es A+");
        } else if (calificacion < 10 && calificacion >= 9.0) {
            System.out.println("Tu calificación es A-");
        } else if (calificacion < 9.0 && calificacion >= 8.0) {
            System.out.println("Tu calificación es B");
        } else if (calificacion < 8.0 && calificacion >= 7.0) {
            System.out.println("Tu calificación es C");
        } else if (calificacion < 7.0 && calificacion >= 6.0) {
            System.out.println("Tu calificación es D");
        } else if (calificacion < 6.0) {
            System.out.println("Tu calificación es F");
        }

    }
}
