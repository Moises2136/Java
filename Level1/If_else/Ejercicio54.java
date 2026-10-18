package Level1.If_else;

import java.util.Scanner;

/**
 * Clase Mayor de tres números
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio54 {
    public static void main(String[] args) {

        Scanner entradaMayor = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.println("Ingresa el primer numero");
        num1 = entradaMayor.nextInt();

        System.out.println("Ingresa el segundo numero");
        num2 = entradaMayor.nextInt();

        System.out.println("Ingresa el segundo numero");
        num3 = entradaMayor.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " es mayor a " + num2 + " y a " + num3);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " es mayor a " + num1 + " y a " + num3);
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println(num3 + " es mayor a " + num1 + " y a " + num2);
        }

    }
}
