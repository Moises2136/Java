package Level5.Pilas;

import java.util.Scanner;

public class PilasMain {

    public static void main(String[] args) {

        Scanner entradaPilas = new Scanner(System.in);

        Ejercicio291 E291 = new Ejercicio291();
        Ejercicio292 E292 = new Ejercicio292();
        Ejercicio293 E293 = new Ejercicio293();
        Ejercicio294 E294 = new Ejercicio294();
        Ejercicio295 E295 = new Ejercicio295();
        Ejercicio296 E296 = new Ejercicio296();
        Ejercicio297 E297 = new Ejercicio297();
        Ejercicio298 E298 = new Ejercicio298();
        Ejercicio299 E299 = new Ejercicio299();
        Ejercicio300 E300 = new Ejercicio300();

        int opcionPilas = 0;

        do {

            System.out.println("1. Pila con arreglo" + "\n" +
                    "2. Pila con lista ligada" + "\n" +
                    "3. push, pop, peek" + "\n" +
                    "4. Invertir un String con pila" + "\n" +
                    "5. Paréntesis balanceados" + "\n" +
                    "6. Decimal a binario" + "\n" +
                    "7. Evaluar postfija" + "\n" +
                    "8. Infija a postfija" + "\n" +
                    "9. Deshacer/rehacer" + "\n" +
                    "10. Pila que regresa el mínimo en O(1)" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionPilas = entradaPilas.nextInt();

            switch (opcionPilas) {
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

        } while (opcionPilas != 0);

    }

}
