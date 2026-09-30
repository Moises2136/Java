package Level1.Imprimir;

import java.util.Scanner;

//Clases importadas
import Level1.Imprimir.*;

public class ImprimirMain {

    public static void main(String[] args) {

        Scanner entradaIm = new Scanner(System.in);

        Ejercicio1 E1 = new Ejercicio1();
        Ejercicio2 E2 = new Ejercicio2();
        Ejercicio3 E3 = new Ejercicio3();
        Ejercicio4 E4 = new Ejercicio4();
        Ejercicio5 E5 = new Ejercicio5();
        Ejercicio6 E6 = new Ejercicio6();
        Ejercicio7 E7 = new Ejercicio7();
        Ejercicio8 E8 = new Ejercicio8();
        Ejercicio9 E9 = new Ejercicio9();
        Ejercicio10 E10 = new Ejercicio10();

        int opcionIm = 0;

        do {

            System.out.println("1. Imprime Hola mundo" + "\n"
                    + "2. Imprime tu nombre, edad y carrera en líneas separadas" + "\n"
                    + "3. Imprime todo lo anterior en una sola línea con print" + "\n"
                    + "4. Imprime un texto con comillas dentro: Java es genial" + "\n"
                    + "5. Imprime un salto de línea y una tabulación con n y t" + "\n"
                    + "6. Guarda tu nombre en una variable e imprímelo con un saludo" + "\n"
                    + "7. Imprime un número entero, uno decimal y un boolean" + "\n"
                    + "8. Imprime un cuadrado de 4x4 con asteriscos" + "\n" + "9. Imprime un triángulo de asteriscos"
                    + "\n" + "10. Imprime una tabla bonita con printf (nombre, edad, calificación)" + "\n"
                    + "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionIm = entradaIm.nextInt();

            switch (opcionIm) {
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

        } while (opcionIm != 0);

    }

}
