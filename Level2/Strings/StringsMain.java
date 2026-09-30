package Level2.Strings;

import java.util.Scanner;

public class StringsMain {

    public static void main(String[] args) {

        Scanner entradaStrings = new Scanner(System.in);

        Ejercicio113 E113 = new Ejercicio113();
        Ejercicio114 E114 = new Ejercicio114();
        Ejercicio115 E115 = new Ejercicio115();
        Ejercicio116 E116 = new Ejercicio116();
        Ejercicio117 E117 = new Ejercicio117();
        Ejercicio118 E118 = new Ejercicio118();
        Ejercicio119 E119 = new Ejercicio119();
        Ejercicio120 E120 = new Ejercicio120();
        Ejercicio121 E121 = new Ejercicio121();
        Ejercicio122 E122 = new Ejercicio122();

        int opcionStrings = 0;

        do {

            System.out.println("1. Longitud de un String" + "\n" +
                    "2. Imprimir letra por letra" + "\n" +
                    "3. Contar vocales" + "\n" +
                    "4. Contar palabras" + "\n" +
                    "5. Invertir un String" + "\n" +
                    "6. Palíndromo" + "\n" +
                    "7. Mayúsculas y minúsculas" + "\n" +
                    "8. Reemplazar un carácter" + "\n" +
                    "9. Contar cuántas veces aparece una letra" + "\n" +
                    "10. Primer carácter que no se repite" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionStrings = entradaStrings.nextInt();

            switch (opcionStrings) {
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

        } while (opcionStrings != 0);

    }

}
