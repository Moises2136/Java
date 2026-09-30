package Level7.Programacion_Dinamica;

import java.util.Scanner;

public class Pro_dinamica_Main {

    public static void main(String[] args) {

        Scanner entradaPDin = new Scanner(System.in);

        Ejercicio388 E388 = new Ejercicio388();
        Ejercicio389 E389 = new Ejercicio389();
        Ejercicio390 E390 = new Ejercicio390();
        Ejercicio391 E391 = new Ejercicio391();
        Ejercicio392 E392 = new Ejercicio392();
        Ejercicio393 E393 = new Ejercicio393();
        Ejercicio394 E394 = new Ejercicio394();
        Ejercicio395 E395 = new Ejercicio395();
        Ejercicio396 E396 = new Ejercicio396();
        Ejercicio397 E397 = new Ejercicio397();

        int opcionPDin = 0;

        do {

            System.out.println("1. Fibonacci con memoización" + "\n" +
                    "2. Fibonacci tabulado" + "\n" +
                    "3. Subir escaleras" + "\n" +
                    "4. Cambio de monedas (mínimo)" + "\n" +
                    "5. Cambio de monedas (formas)" + "\n" +
                    "6. Mochila 0/1" + "\n" +
                    "7. Subsecuencia común más larga" + "\n" +
                    "8. Subsecuencia creciente más larga" + "\n" +
                    "9. Distancia de edición" + "\n" +
                    "10. Caminos en una cuadrícula" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionPDin = entradaPDin.nextInt();

            switch (opcionPDin) {
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

        } while (opcionPDin != 0);

    }

}
