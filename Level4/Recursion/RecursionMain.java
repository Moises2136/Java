package Level4.Recursion;

import java.util.Scanner;

public class RecursionMain {

    public static void main(String[] args) {

        Scanner entradaRecursion = new Scanner(System.in);

        Ejercicio238 E238 = new Ejercicio238();
        Ejercicio239 E239 = new Ejercicio239();
        Ejercicio240 E240 = new Ejercicio240();
        Ejercicio241 E241 = new Ejercicio241();
        Ejercicio242 E242 = new Ejercicio242();
        Ejercicio243 E243 = new Ejercicio243();
        Ejercicio244 E244 = new Ejercicio244();
        Ejercicio245 E245 = new Ejercicio245();
        Ejercicio246 E246 = new Ejercicio246();
        Ejercicio247 E247 = new Ejercicio247();

        int opcionRecursion = 0;

        do {

            System.out.println("1. Factorial" + "\n" +
                    "2. Fibonacci" + "\n" +
                    "3. Potencia" + "\n" +
                    "4. Suma de dígitos" + "\n" +
                    "5. Contar dígitos" + "\n" +
                    "6. Invertir un String" + "\n" +
                    "7. Palíndromo" + "\n" +
                    "8. Máximo de un arreglo" + "\n" +
                    "9. Torres de Hanói" + "\n" +
                    "10. Permutaciones de un String" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionRecursion = entradaRecursion.nextInt();

            switch (opcionRecursion) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcionRecursion != 0);

    }

}
