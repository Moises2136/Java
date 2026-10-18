package Level1.While_do_while;

import java.util.Scanner;

/**
 * Clase Sumar dígitos de un número
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio83 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int valSum = 0;
        int val = 0;

        System.out.println("Introduce un numero que se va a sumar sus digitos");
        val = entrada.nextInt();

        int original = val;

        while (val != 0) {
            valSum += val % 10;
            val = val / 10;
        }

        System.out.println("Suma de los digitos de " + original + " es " + valSum);

    }
}
