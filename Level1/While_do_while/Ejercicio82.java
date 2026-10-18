package Level1.While_do_while;

import java.util.Scanner;

/**
 * Clase Pedir números hasta que el usuario escriba 0
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio82 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int val = 1;

        while (val != 0) {
            System.out.println("Ingresa un valor del 0-10 para salir: ");
            val = entrada.nextInt();
        }

    }
}
