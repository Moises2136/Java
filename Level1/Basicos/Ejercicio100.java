package Level1.Basicos;

import java.util.Scanner;

/**
 * Clase ¿Es número primo?
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio100 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int val = 0;

        System.out.println("Introduce un numero para saber si es primo o no: ");
        val = entrada.nextInt();
        int n = 0;

        for (int i = 1; i <= val; i++) {
            if (val % i == 0) {
                n++;
            }
        }

        if (n == 2)
            System.out.println("Es primo");
        else
            System.out.println("No es primo");

    }
}
