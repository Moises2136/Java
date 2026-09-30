package Level2.Arreglos;

import java.util.Scanner;

public class ArreglosMain {

    public static void main(String[] args) {

        Scanner entradaArreglos = new Scanner(System.in);

        Ejercicio103 E103 = new Ejercicio103();
        Ejercicio104 E104 = new Ejercicio104();
        Ejercicio105 E105 = new Ejercicio105();
        Ejercicio106 E106 = new Ejercicio106();
        Ejercicio107 E107 = new Ejercicio107();
        Ejercicio108 E108 = new Ejercicio108();
        Ejercicio109 E109 = new Ejercicio109();
        Ejercicio110 E110 = new Ejercicio110();
        Ejercicio111 E111 = new Ejercicio111();
        Ejercicio112 E112 = new Ejercicio112();

        int opcionArreglos = 0;

        do {

            System.out.println("1. Llenar e imprimir un arreglo" + "\n" +
                    "2. Suma de elementos" + "\n" +
                    "3. Promedio" + "\n" +
                    "4. Máximo y mínimo" + "\n" +
                    "5. Buscar un elemento" + "\n" +
                    "6. Contar pares e impares" + "\n" +
                    "7. Invertir un arreglo" + "\n" +
                    "8. Copiar un arreglo en otro" + "\n" +
                    "9. Eliminar duplicados" + "\n" +
                    "10. Rotar k posiciones" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionArreglos = entradaArreglos.nextInt();

            switch (opcionArreglos) {
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

        } while (opcionArreglos != 0);

    }

}
