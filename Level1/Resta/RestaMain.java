package Level1.Resta;

import java.util.Scanner;

import Level1.Resta.*;

public class RestaMain {

    public static void main(String[] args) {

        Scanner entradaRes = new Scanner(System.in);

        Ejercicio21 E21 = new Ejercicio21();
        Ejercicio22 E22 = new Ejercicio22();
        Ejercicio23 E23 = new Ejercicio23();
        Ejercicio24 E24 = new Ejercicio24();
        Ejercicio25 E25 = new Ejercicio25();
        Ejercicio26 E26 = new Ejercicio26();
        Ejercicio27 E27 = new Ejercicio27();
        Ejercicio28 E28 = new Ejercicio28();
        Ejercicio29 E29 = new Ejercicio29();
        Ejercicio30 E30 = new Ejercicio30();

        int opcionRes = 0;

        do {

            System.out.println("1. Resta dos números fijos" + "\n" +
                    "2. Resta dos números del usuario" + "\n" +
                    "3. Calcula el cambio de una compra" + "\n" +
                    "4. Calcula tu edad a partir del año de nacimiento" + "\n" +
                    "5. Resta usando -=" + "\n" +
                    "6. Diferencia de temperatura entre dos días" + "\n" +
                    "7. Resta que dé resultado negativo e imprímelo" + "\n" +
                    "8. Valor absoluto de una resta con Math.abs" + "\n" +
                    "9. Días que faltan para tu cumpleaños (con números fijos)" + "\n" +
                    "10. Descuento: precio menos el 15%" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionRes = entradaRes.nextInt();

            switch (opcionRes) {
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

        } while (opcionRes != 0);

    }

}
