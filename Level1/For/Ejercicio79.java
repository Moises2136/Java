package Level1.For;

import java.util.Scanner;

/**
 * Clase Primeros n números de Fibonacci
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio79 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce cuantos numero fibonacci quieres: ");
        int n = entrada.nextInt();

        int x = 0;
        int y = 1;
        int resultado = 0;

        for (int i = 1; i <= n; i++) {

            System.out.println("El numero fibo es: " + x);

            resultado = x + y; // 0,1,1,2,3,5,8,13
            x = y;
            y = resultado;
        }

    }
}
