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
        int val;

        while (valSum != 100) {
            System.out.println("Suma hasta llegar a 100 " + valSum);
            val = entrada.nextInt();

            valSum += val;
        }

    }
}
