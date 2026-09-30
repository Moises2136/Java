package Level4.Ordenamiento;

import java.util.Scanner;

public class OrdenamientoMain {

    public static void main(String[] args) {

        Scanner entradaOrdenamiento = new Scanner(System.in);

        Ejercicio258 E258 = new Ejercicio258();
        Ejercicio259 E259 = new Ejercicio259();
        Ejercicio260 E260 = new Ejercicio260();
        Ejercicio261 E261 = new Ejercicio261();
        Ejercicio262 E262 = new Ejercicio262();
        Ejercicio263 E263 = new Ejercicio263();
        Ejercicio264 E264 = new Ejercicio264();
        Ejercicio265 E265 = new Ejercicio265();
        Ejercicio266 E266 = new Ejercicio266();
        Ejercicio267 E267 = new Ejercicio267();

        int opcionOrdenamiento = 0;

        do {

            System.out.println("1. Bubble sort" + "\n" +
                    "2. Bubble sort optimizado" + "\n" +
                    "3. Selection sort" + "\n" +
                    "4. Insertion sort" + "\n" +
                    "5. Merge sort" + "\n" +
                    "6. Quick sort" + "\n" +
                    "7. Counting sort" + "\n" +
                    "8. Ordenar Strings alfabéticamente" + "\n" +
                    "9. Ordenar objetos con Comparable" + "\n" +
                    "10. Comparar tiempos de todos los algoritmos" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionOrdenamiento = entradaOrdenamiento.nextInt();

            switch (opcionOrdenamiento) {
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

        } while (opcionOrdenamiento != 0);

    }

}
