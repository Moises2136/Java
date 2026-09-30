package Level7.Backtracking;

import java.util.Scanner;

public class BacktrackingMain {

    public static void main(String[] args) {

        Scanner entradaBack = new Scanner(System.in);

        Ejercicio398 E398 = new Ejercicio398();
        Ejercicio399 E399 = new Ejercicio399();
        Ejercicio400 E400 = new Ejercicio400();
        Ejercicio401 E401 = new Ejercicio401();
        Ejercicio402 E402 = new Ejercicio402();
        Ejercicio403 E403 = new Ejercicio403();
        Ejercicio404 E404 = new Ejercicio404();
        Ejercicio405 E405 = new Ejercicio405();
        Ejercicio406 E406 = new Ejercicio406();

        int opcionBack = 0;

        do {

            System.out.println("1. Subconjuntos de un conjunto" + "\n" +
                    "2. Permutaciones" + "\n" +
                    "3. Combinaciones" + "\n" +
                    "4. Suma de subconjunto" + "\n" +
                    "5. Laberinto" + "\n" +
                    "6. N reinas" + "\n" +
                    "7. Sudoku" + "\n" +
                    "8. Palabra en una sopa de letras" + "\n" +
                    "9. Coloreo de grafos" + "\n" +
                    "10. Recorrido del caballo" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionBack = entradaBack.nextInt();

            switch (opcionBack) {
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

        } while (opcionBack != 0);

    }

}
