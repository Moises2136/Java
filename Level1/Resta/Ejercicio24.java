package Level1.Resta;

import java.util.Scanner;

/**
 * Clase que calcula el tu edad por el año de naciemiento
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio24 {
    /**
     * Meotodo main que calcula la edad de una persona
     *
     * @param EntradaEdad valor de entrada del usaurio
     * @param Naciemiento Año de nacimiento de la perona
     * @param Actual      Año actual
     */
    public static void main(String[] args) {

        Scanner EntradaEdad = new Scanner(System.in);

        int Nacimiento = 0;
        int Actual = 2026;

        System.out.println("Introduce tu año de Nacimeinto: ");
        Nacimiento = EntradaEdad.nextInt();

        System.out.println("Tu edad es: " + (Actual - Nacimiento));

    }
}
