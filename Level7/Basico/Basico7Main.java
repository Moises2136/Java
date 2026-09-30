package Level7.Basico;

import java.util.Scanner;

public class Basico7Main {

    public static void main(String[] args) {

        Scanner entradaBasico7 = new Scanner(System.in);

        Ejercicio438 E438 = new Ejercicio438();
        Ejercicio439 E439 = new Ejercicio439();
        Ejercicio440 E440 = new Ejercicio440();
        Ejercicio441 E441 = new Ejercicio441();
        Ejercicio442 E442 = new Ejercicio442();
        Ejercicio443 E443 = new Ejercicio443();
        Ejercicio444 E444 = new Ejercicio444();
        Ejercicio445 E445 = new Ejercicio445();
        Ejercicio446 E446 = new Ejercicio446();
        Ejercicio447 E447 = new Ejercicio447();
        Ejercicio448 E448 = new Ejercicio448();
        Ejercicio449 E449 = new Ejercicio449();

        int opcionBasico7 = 0;

        do {

            System.out.println("1. Fibonacci con programación dinámica" + "\n" +
                    "2. Subir escaleras (1 o 2 escalones)" + "\n" +
                    "3. Cambio de monedas" + "\n" +
                    "4. Mochila 0/1" + "\n" +
                    "5. Subsecuencia común más larga" + "\n" +
                    "6. N reinas con backtracking" + "\n" +
                    "7. Resolver un Sudoku" + "\n" +
                    "8. Trie para autocompletar" + "\n" +
                    "9. Union-Find" + "\n" +
                    "10. Árbol AVL con rotaciones" + "\n" +
                    "11. Árbol rojinegro: inserción" + "\n" +
                    "12. Árbol rojinegro: eliminación" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionBasico7 = entradaBasico7.nextInt();

            switch (opcionBasico7) {
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
                case 11:
                case 12:
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcionBasico7 != 0);

    }

}
