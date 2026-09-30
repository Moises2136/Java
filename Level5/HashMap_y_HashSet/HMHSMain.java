package Level5.HashMap_y_HashSet;

import java.util.Scanner;

public class HMHSMain {

    public static void main(String[] args) {

        Scanner entradaHMHS = new Scanner(System.in);

        Ejercicio311 E311 = new Ejercicio311();
        Ejercicio312 E312 = new Ejercicio312();
        Ejercicio313 E313 = new Ejercicio313();
        Ejercicio314 E314 = new Ejercicio314();
        Ejercicio315 E315 = new Ejercicio315();
        Ejercicio316 E316 = new Ejercicio316();
        Ejercicio317 E317 = new Ejercicio317();
        Ejercicio318 E318 = new Ejercicio318();
        Ejercicio319 E319 = new Ejercicio319();
        Ejercicio320 E320 = new Ejercicio320();

        int opcionHMHS = 0;

        do {

            System.out.println("1. Crear y recorrer un HashMap" + "\n" +
                    "2. Frecuencia de palabras" + "\n" +
                    "3. Frecuencia de letras" + "\n" +
                    "4. Two Sum" + "\n" +
                    "5. Anagramas con HashMap" + "\n" +
                    "6. Quitar duplicados con HashSet" + "\n" +
                    "7. Intersección de dos arreglos" + "\n" +
                    "8. Primer elemento repetido" + "\n" +
                    "9. Agrupar anagramas" + "\n" +
                    "10. Tu propio HashMap sencillo" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionHMHS = entradaHMHS.nextInt();

            switch (opcionHMHS) {
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

        } while (opcionHMHS != 0);

    }

}
