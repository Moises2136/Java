package Level1.For;

import java.util.Scanner;

/**
 * Clase Suma del 1 al n
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio75 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n = 0;

        System.out.println("Introduce el valor de N a sumar");
        int x = entrada.nextInt();

        for (int i = 1; i <= x; i++) {
            n = n + i;
            System.out.println("Suma: " + n);
        }

    }
}