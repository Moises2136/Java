package Level1.While_do_while;

import java.util.Scanner;

/**
 * Clase Validar que el usuario escriba un número en rango
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio87 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int val = 0;
        int rango = 0;

        while (rango != 2) {

            System.out.println("Ingresa un numero de estos tres rangos" + "\n"
                    + "Rango 1 (0-10)" + "\n Rango 2 (11-20)" + "\n Rango 3 (21-30)");
            val = entrada.nextInt();

            if (val >= 0 && val <= 10) {
                System.out.println("Pertenence al Rango 1 (0-10)");
                rango = 1;
            } else if (val <= 20 && val >= 11) {
                System.out.println("Pertenence al Rango 2 (11-20)");
                rango = 2;
            } else if (val <= 30 && val >= 21) {
                System.out.println("Pertenence al Rango 3 (21-30)");
                rango = 3;
            } else {
                System.out.println("Fuera del rango");
            }

        }

    }
}
