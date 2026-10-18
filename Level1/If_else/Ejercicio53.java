package Level1.If_else;

import java.util.Scanner;

/**
 * Clase Mayor de dos números
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio53 {
    public static void main(String[] args) {
        Scanner entradaMayor = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Ingresa el primer numero");
        num1 = entradaMayor.nextInt();

        System.out.println("Ingresa el segundo numero");
        num2 = entradaMayor.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " es mayor a " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " es mayor a" + num1);
        } else {
            System.out.println("Los numeros son iguales");
        }

    }
}
