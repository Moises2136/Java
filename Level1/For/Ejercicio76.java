package Level1.For;

import java.util.Scanner;

/**
 * Clase Factorial con for
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio76 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Mete el factorial de un numero: ");
        int x = entrada.nextInt();

        long factorial = 1;

        for (int i = 1; i <= x; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + x + " es " + (factorial));

    }
}
