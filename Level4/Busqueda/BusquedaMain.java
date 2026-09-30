package Level4.Busqueda;

import java.util.Scanner;

public class BusquedaMain {

    public static void main(String[] args) {

        Scanner entradaBusqueda = new Scanner(System.in);

        Ejercicio248 E248 = new Ejercicio248();
        Ejercicio249 E249 = new Ejercicio249();
        Ejercicio250 E250 = new Ejercicio250();
        Ejercicio251 E251 = new Ejercicio251();
        Ejercicio252 E252 = new Ejercicio252();
        Ejercicio253 E253 = new Ejercicio253();
        Ejercicio254 E254 = new Ejercicio254();
        Ejercicio255 E255 = new Ejercicio255();
        Ejercicio256 E256 = new Ejercicio256();
        Ejercicio257 E257 = new Ejercicio257();

        int opcionBusqueda = 0;

        do {

            System.out.println("1. Búsqueda lineal" + "\n" +
                    "2. Búsqueda lineal con todas las posiciones" + "\n" +
                    "3. Búsqueda binaria iterativa" + "\n" +
                    "4. Búsqueda binaria recursiva" + "\n" +
                    "5. Primera aparición con búsqueda binaria" + "\n" +
                    "6. Última aparición con búsqueda binaria" + "\n" +
                    "7. Raíz cuadrada entera con búsqueda binaria" + "\n" +
                    "8. Buscar en matriz ordenada" + "\n" +
                    "9. Elemento faltante en arreglo de 1 a n" + "\n" +
                    "10. Pico en un arreglo" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionBusqueda = entradaBusqueda.nextInt();

            switch (opcionBusqueda) {
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

        } while (opcionBusqueda != 0);

    }
}
