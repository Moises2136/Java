package Level1.Basicos;

import java.util.Scanner;

/**
 * Clase Convertir °C a °F
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio95 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double val;

        System.out.println("Convertidor de °C a °F");
        System.out.print("Introduce los °C: ");
        val = entrada.nextDouble();

        val = (val * (9.0 / 5)) + 32;

        System.out.println("Hay " + val + " °F");

    }
}
