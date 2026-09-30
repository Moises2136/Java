package Level4.Basico;

import java.util.Scanner;

public class Basico4Main {
    public static void main(String[] args) {

        Scanner entradaBasico4 = new Scanner(System.in);

        int opcionBasico4 = 0;

        Ejercicio268 E268 = new Ejercicio268();
        Ejercicio269 E269 = new Ejercicio269();
        Ejercicio270 E270 = new Ejercicio270();
        Ejercicio271 E271 = new Ejercicio271();
        Ejercicio272 E272 = new Ejercicio272();
        Ejercicio273 E273 = new Ejercicio273();
        Ejercicio274 E274 = new Ejercicio274();
        Ejercicio275 E275 = new Ejercicio275();
        Ejercicio276 E276 = new Ejercicio276();
        Ejercicio277 E277 = new Ejercicio277();
        Ejercicio278 E278 = new Ejercicio278();
        Ejercicio279 E279 = new Ejercicio279();
        Ejercicio280 E280 = new Ejercicio280();

        do {

            System.out.println("1. Factorial recursivo" + "\n" +
                    "2. Fibonacci recursivo y con memoización" + "\n" +
                    "3. Potencia recursiva" + "\n" +
                    "4. Suma de dígitos recursiva" + "\n" +
                    "5. Palíndromo recursivo" + "\n" +
                    "6. Búsqueda binaria (iterativa y recursiva)" + "\n" +
                    "7. Bubble sort" + "\n" +
                    "8. Selection sort" + "\n" +
                    "9. Insertion sort" + "\n" +
                    "10. Merge sort" + "\n" +
                    "11. Quick sort" + "\n" +
                    "12. Torres de Hanói" + "\n" +
                    "13. Todas las permutaciones de un String" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionBasico4 = entradaBasico4.nextInt();

            switch (opcionBasico4) {
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
                case 13:
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcionBasico4 != 0);

    }

}
