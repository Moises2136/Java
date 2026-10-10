package Level1.Resta;

import java.util.Scanner;

/**
 * Clase que resta 2 valores ingresados por el usuario
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio22 {

    /**
     * Meotodo que resta dos valores introducidos por el usaurio
     *
     * @param valor1 un valor int
     * @param valor2 un valor int
     */
    public static void main(String[] args) {

        Scanner entradaR = new Scanner(System.in);

        int valor1 = 0;
        int valor2 = 0;

        System.out.println("Introduce el primer valor de la resta: ");
        valor1 = entradaR.nextInt();

        System.out.println("Introduce el segundo valor de la resta");
        valor2 = entradaR.nextInt();

        System.out.println("El resultado es: " + (valor1 - valor2));

    }
}
