package Level1.While_do_while;

import java.util.Scanner;

/**
 * Clase Adivina el número (aleatorio con pistas)
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio86 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int val = 0;
        int secreto = (int) (Math.random() * 20) + 1;

        while (val != secreto) {

            System.out.println("Ingresa un numero del 1-20 para cerrar: ");
            val = entrada.nextInt();

            if (val < secreto) {
                System.out.println("El numero es mayor");
            } else if (val > secreto) {
                System.out.println("El numero es menor");
            }

        }

        System.out.println("Adivinaste el numero: " + secreto);

    }
}
