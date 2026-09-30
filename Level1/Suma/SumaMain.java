package Level1.Suma;

import java.util.Scanner;

import Level1.Suma.*;

public class SumaMain {

    public static void main(String[] args) {

        Scanner entradaSum = new Scanner(System.in);

        Ejercicio11 E11 = new Ejercicio11();
        Ejercicio12 E12 = new Ejercicio12();
        Ejercicio13 E13 = new Ejercicio13();
        Ejercicio14 E14 = new Ejercicio14();
        Ejercicio15 E15 = new Ejercicio15();
        Ejercicio16 E16 = new Ejercicio16();
        Ejercicio17 E17 = new Ejercicio17();
        Ejercicio18 E18 = new Ejercicio18();
        Ejercicio19 E19 = new Ejercicio19();
        Ejercicio20 E20 = new Ejercicio20();

        int opcionSum = 0;

        do {

            System.out.println("1. Suma dos números fijos" + "\n" +
                    "2. Suma dos números que escriba el usuario con Scanner" + "\n" +
                    "3. Suma tres números" + "\n" +
                    "4. Suma dos decimales" + "\n" +
                    "5. Suma un int y un double y observa el tipo del resultado" + "\n" +
                    "6. Suma usando +=" + "\n" +
                    "7. Suma los números del 1 al 10 sin ciclo" + "\n" +
                    "8. Calcula el total de una compra de 3 productos" + "\n" +
                    "9. Suma horas y minutos (1h 50min + 2h 30min = 4h 20min)" + "\n" +
                    "10. Concatena vs. suma: \"5\" + 3 contra 5 + 3; explica la diferencia" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionSum = entradaSum.nextInt();

            switch (opcionSum) {
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

        } while (opcionSum != 0);

    }

}
