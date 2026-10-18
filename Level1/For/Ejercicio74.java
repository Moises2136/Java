package Level1.For;

import java.util.Scanner;

/**
 * Clase Tabla de multiplicar de un número
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio74 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa un numero para tener una tabla de multiplicar: ");
        int num = entrada.nextInt();

        System.out.println("------------ Tabla ------------");

        for (int i = 1; i <= 10; i++) {
            System.out.println((num + " x " + i) + " = " + (num * i));
        }

    }
}
