package Level1.Switch;

import java.util.Scanner;

/**
 * Clase Calculadora con switch de operador
 * 
 * @author Moisés
 * @version 1.0
 */

public class Ejercicio63 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Calculadora elije tu operación (+,-,*,/)");

        String op = entrada.nextLine();
        int val1;
        int val2;
        double resultdo;

        switch (op) {
            case "+":
                System.out.println("Introduce el primer valor para sumar: ");
                val1 = entrada.nextInt();
                System.out.println("Introduce el segundo valor para sumar: ");
                val2 = entrada.nextInt();

                resultdo = val1 + val2;

                System.out.println("Resultado: " + resultdo);
                break;
            case "-":
                System.out.println("Introduce el primer valor para restar: ");
                val1 = entrada.nextInt();
                System.out.println("Introduce el segundo valor para restar: ");
                val2 = entrada.nextInt();

                resultdo = val1 - val2;

                System.out.println("Resultado: " + resultdo);
                break;
            case "*":
                System.out.println("Introduce el primer valor para multiplicar: ");
                val1 = entrada.nextInt();
                System.out.println("Introduce el segundo valor para multiplicar: ");
                val2 = entrada.nextInt();

                resultdo = val1 * val2;

                System.out.println("Resultado: " + resultdo);
                break;
            case "/":
                System.out.println("Introduce el primer valor para dividir: ");
                val1 = entrada.nextInt();
                System.out.println("Introduce el segundo valor para dividir: ");
                val2 = entrada.nextInt();

                resultdo = (double) val1 / val2;

                System.out.println("Resultado: " + resultdo);
                break;
            default:
                System.out.println("Operación invalida");
                break;
        }

    }
}
