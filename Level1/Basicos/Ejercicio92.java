package Level1.Basicos;

import java.util.Scanner;

/**
 * Clase Calculadora de las 4 operaciones
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio92 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double val1 = 0;
        double val2 = 0;
        double total;
        int op;

        do {

            System.out.println("Elige una operación: ");

            System.out.println("1. Sumar" + "\n" + "2. Restar" + "\n" + "3. Dividir" + "\n" + "4. Multiplicar");

            System.out.println("Introduce tu opción: ");
            op = entrada.nextInt();

            if (op == 1) {
                System.out.println("Introduce el primer valor: ");
                val1 = entrada.nextDouble();
                System.out.println("Introduce el segundo valor: ");
                val2 = entrada.nextDouble();

                total = val1 + val2;

                System.out.println("El total de la suma es: " + total);
            } else if (op == 2) {
                System.out.println("Introduce el primer valor: ");
                val1 = entrada.nextDouble();
                System.out.println("Introduce el segundo valor: ");
                val2 = entrada.nextDouble();

                total = val1 - val2;

                System.out.println("El total de la resta es: " + total);
            } else if (op == 3) {
                System.out.println("Introduce el primer valor: ");
                val1 = entrada.nextDouble();
                System.out.println("Introduce el segundo valor: ");
                val2 = entrada.nextDouble();

                total = val1 / val2;

                System.out.println("El total de la división es: " + total);
            } else if (op == 4) {
                System.out.println("Introduce el primer valor: ");
                val1 = entrada.nextDouble();
                System.out.println("Introduce el segundo valor: ");
                val2 = entrada.nextDouble();

                total = val1 * val2;

                System.out.println("El total de la multiplicación es: " + total);
            }

        } while (op != 0);

    }
}
