package Level1.For;

import java.util.Scanner;

/**
 * Clase Contar divisores de un número
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio77 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int cuenta = 0;

        System.out.println("Divisores de el numero (ingresa un numero): ");
        int div = entrada.nextInt();

        System.out.println(div + " sus divisores son ");

        for (int i = 1; i <= div; i++) {
            if (div % i == 0) {
                System.out.println(i);
                cuenta++;
            }
        }

        System.out.println("Total de divisores: " + cuenta);

    }
}
