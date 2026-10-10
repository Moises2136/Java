package Level1.Suma;

import java.util.Scanner;

/**
 * Clase que suma dos valores metidos por el usuario
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio12 {

    /**
     * Metodo para sumar dos valores de entrada por el usuario
     *
     * @param num1Entrada    tiene un valor de int un numero
     * @param num2Entrada    tiene un valor de int un numero
     * @param entradaNumUser Valor de entrada en numero por el usaurio
     */
    public static void main(String[] args) {

        Scanner entradaNumUser = new Scanner(System.in);

        int num1Entrada = 0;
        int num2Entrada = 0;

        System.out.println("Ingresa el primer valor a sumar: ");
        num1Entrada = entradaNumUser.nextInt();
        System.out.println("Ingresa el segundo valor a sumar: ");
        num2Entrada = entradaNumUser.nextInt();

        System.out.println("El resultado final es: " + (num1Entrada + num2Entrada));

    }
}
