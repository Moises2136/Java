package Level6.Heaps;

import java.util.Scanner;

public class HeapsMain {

    public static void main(String[] args) {

        Scanner entradaHeaps = new Scanner(System.in);

        Ejercicio354 E354 = new Ejercicio354();
        Ejercicio355 E355 = new Ejercicio355();
        Ejercicio356 E356 = new Ejercicio356();
        Ejercicio357 E357 = new Ejercicio357();
        Ejercicio358 E358 = new Ejercicio358();
        Ejercicio359 E359 = new Ejercicio359();
        Ejercicio360 E360 = new Ejercicio360();
        Ejercicio361 E361 = new Ejercicio361();
        Ejercicio362 E362 = new Ejercicio362();
        Ejercicio363 E363 = new Ejercicio363();

        int opcionHeaps = 0;

        do {

            System.out.println("1. Min-heap con arreglo" + "\n" +
                    "2. Insertar" + "\n" +
                    "3. Extraer mínimo" + "\n" +
                    "4. Max-heap" + "\n" +
                    "5. Heapify" + "\n" +
                    "6. Heap sort" + "\n" +
                    "7. k elementos más grandes" + "\n" +
                    "8. Unir k listas ordenadas" + "\n" +
                    "9. Mediana en flujo de datos" + "\n" +
                    "10. Tu propia cola de prioridad" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionHeaps = entradaHeaps.nextInt();

            switch (opcionHeaps) {
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

        } while (opcionHeaps != 0);

    }

}
