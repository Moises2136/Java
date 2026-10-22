package Level1.Basicos;

import java.util.Scanner;

/**
 * Clase Suma de 1 a n
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio99 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce n: ");
        int n = entrada.nextInt();

        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println("La suma de 1 a " + n + " es: " + suma);
    }
}
