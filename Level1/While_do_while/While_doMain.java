package Level1.While_do_while;

import java.util.Scanner;

import Level1.While_do_while.*;

public class While_doMain {

    public static void main(String[] args) {

        Scanner entradaWd = new Scanner(System.in);

        Ejercicio81 E81 = new Ejercicio81();
        Ejercicio82 E82 = new Ejercicio82();
        Ejercicio83 E83 = new Ejercicio83();
        Ejercicio84 E84 = new Ejercicio84();
        Ejercicio85 E85 = new Ejercicio85();
        Ejercicio86 E86 = new Ejercicio86();
        Ejercicio87 E87 = new Ejercicio87();
        Ejercicio88 E88 = new Ejercicio88();
        Ejercicio89 E89 = new Ejercicio89();
        Ejercicio90 E90 = new Ejercicio90();

        int opcionWd = 0;

        do {

            System.out.println("1. Contador del 1 al 10 con while" + "\n" +
                    "2. Pedir números hasta que el usuario escriba 0" + "\n" +
                    "3. Sumar dígitos de un número" + "\n" +
                    "4. Invertir un número (1234 → 4321)" + "\n" +
                    "5. ¿Es palíndromo numérico?" + "\n" +
                    "6. Adivina el número (aleatorio con pistas)" + "\n" +
                    "7. Validar que el usuario escriba un número en rango" + "\n" +
                    "8. Menú con do-while" + "\n" +
                    "9. Contar cuántos dígitos tiene un número" + "\n" +
                    "10. Máximo común divisor (algoritmo de Euclides)" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionWd = entradaWd.nextInt();

            switch (opcionWd) {
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

        } while (opcionWd != 0);

    }

}
