package Level1.Basicos;

import java.util.Scanner;

/**
 * Clase Tabla de multiplicar de un número
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio97 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int val;

        System.out.println("Introduce un numero para obtener su tabla de multiplicar hasta 20: ");
        val = entrada.nextInt();

        for (int n = 1; n <= 20; n++) {
            System.out.println(n + " x " + val + " = " + (n * val) + "\n");
        }
    }
}
