package Level1.For;

import java.util.Scanner;

import Level1.For.*;

public class ForMain {

    public static void main(String[] args) {

        Scanner entradaFor = new Scanner(System.in);

        Ejercicio71 E71 = new Ejercicio71();
        Ejercicio72 E72 = new Ejercicio72();
        Ejercicio73 E73 = new Ejercicio73();
        Ejercicio74 E74 = new Ejercicio74();
        Ejercicio75 E75 = new Ejercicio75();
        Ejercicio76 E76 = new Ejercicio76();
        Ejercicio77 E77 = new Ejercicio77();
        Ejercicio78 E78 = new Ejercicio78();
        Ejercicio79 E79 = new Ejercicio79();
        Ejercicio80 E80 = new Ejercicio80();

        int opcionFor = 0;

        do {

            System.out.println("1. Imprime del 1 al 10" + "\n" +
                    "2. Imprime del 10 al 1" + "\n" +
                    "3. Números pares del 1 al 50" + "\n" +
                    "4. Tabla de multiplicar de un número" + "\n" +
                    "5. Suma del 1 al n" + "\n" +
                    "6. Factorial con for" + "\n" +
                    "7. Contar divisores de un número" + "\n" +
                    "8. ¿Es primo?" + "\n" +
                    "9. Primeros n números de Fibonacci" + "\n" +
                    "10. Pirámide de asteriscos centrada" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionFor = entradaFor.nextInt();

            switch (opcionFor) {
                case 1:
                    E71.main(args);
                    break;
                case 2:
                    E72.main(args);
                    break;
                case 3:
                    E73.main(args);
                    break;
                case 4:
                    E74.main(args);
                    break;
                case 5:
                    E75.main(args);
                    break;
                case 6:
                    E76.main(args);
                    break;
                case 7:
                    E77.main(args);
                    break;
                case 8:
                    E78.main(args);
                    break;
                case 9:
                    E79.main(args);
                    break;
                case 10:
                    E80.main(args);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcionFor != 0);

    }

}
