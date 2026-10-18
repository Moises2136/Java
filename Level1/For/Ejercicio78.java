package Level1.For;

import java.util.Scanner;

/**
 * Clase ¿Es primo?
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio78 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa un numero para saber si es primo o no: ");
        int p = entrada.nextInt();
        int n = 0;

        for (int i = 1; i <= p; i++) {
            if (p % i == 0) {
                n++;
            }
        }

        if (n == 2)
            System.out.println("Es primo");
        else
            System.out.println("No es primo");

    }
}
