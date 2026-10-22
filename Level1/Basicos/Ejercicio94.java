package Level1.Basicos;

import java.util.Scanner;

/**
 * Clase Mayor de tres números
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio94 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int val, val1, val2;

        System.out.println("Introduce el primer numero para saber si es mayor de los 3: ");
        val = entrada.nextInt();
        System.out.println("Introduce el segundo numero para saber si es mayor de los 3: ");
        val1 = entrada.nextInt();
        System.out.println("Introduce el tercero numero para saber si es mayor de los 3: ");
        val2 = entrada.nextInt();

        if (val >= val1 && val >= val2) {
            System.out.println("El numero " + val + " es mayor a " + val1 + " y " + val2);
        } else if (val1 >= val && val1 >= val2) {
            System.out.println("El numero " + val1 + " es mayor a " + val + " y " + val2);
        } else if (val2 >= val && val2 >= val1) {
            System.out.println("El numero " + val2 + " es mayor a " + val + " y " + val1);
        }
    }
}
