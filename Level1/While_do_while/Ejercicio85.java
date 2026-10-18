package Level1.While_do_while;

import java.util.Scanner;

/**
 * Clase ¿Es palíndromo numérico?
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio85 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int val = 0;
        int val1;
        int valp = 0;

        System.out.println("Introduce un numero para saber si es palindromo: ");
        val = entrada.nextInt();

        val1 = val;

        while (val > 0) {
            int digito = val % 10;
            valp = valp * 10 + digito;
            val /= 10;
        }

        if (val1 == valp) {
            System.out.println("Es palindromo");
        } else if (val1 != valp) {
            System.out.println("No es palindromo");
        }
    }
}
