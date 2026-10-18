package Level1.If_else;

import java.util.Scanner;

/**
 * Clase si estas aprobado o reprobado
 * 
 * @author Moisés
 * @version 1.0
 */

public class Ejercicio55 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int calificacion = entrada.nextInt();

        if (calificacion >= 6) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

    }
}
