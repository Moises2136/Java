package Level1.While_do_while;

import java.util.Scanner;

/**
 * Clase Máximo común divisor (algoritmo de Euclides)
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio90 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int residuo = 1;

        System.out.println("MCD(A,B)");
        System.out.println("Introduce un numero para el algoritmo de Euclides A: ");
        int val_a = sc.nextInt();
        System.out.println("Introduce un numero para el algoritmo de Euclides B: ");
        int val_b = sc.nextInt();

        while (residuo != 0) {
            residuo = val_a % val_b;
            System.out.println("Residuo: " + residuo);
            val_a = val_b;
            val_b = residuo;

            System.out.println("El nuevo valor de A es: " + val_a + " y el nuevo valor de B es: " + val_b);
        }
        System.out.println("El MCD es: " + val_a);

    }
}
