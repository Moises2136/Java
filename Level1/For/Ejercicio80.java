package Level1.For;

/**
 * Clase Pirámide de asteriscos centrada
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio80 {
    public static void main(String[] args) {
        String vacio = " ";
        String asterisco = "*";
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(vacio);
            }
            for (int x = 0; x < 2 * i - 1; x++) {
                System.out.print(asterisco);
            }
            System.out.println();
        }

    }
}
