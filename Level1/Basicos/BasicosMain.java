package Level1.Basicos;

import java.util.Scanner;

import Level1.Basicos.*;

public class BasicosMain {

    public static void main(String[] args) {

        Scanner entradaBas1 = new Scanner(System.in);

        Ejercicio91 E91 = new Ejercicio91();
        Ejercicio92 E92 = new Ejercicio92();
        Ejercicio93 E93 = new Ejercicio93();
        Ejercicio94 E94 = new Ejercicio94();
        Ejercicio95 E95 = new Ejercicio95();
        Ejercicio96 E96 = new Ejercicio96();
        Ejercicio97 E97 = new Ejercicio97();
        Ejercicio98 E98 = new Ejercicio98();
        Ejercicio99 E99 = new Ejercicio99();
        Ejercicio100 E100 = new Ejercicio100();
        Ejercicio101 E101 = new Ejercicio101();
        Ejercicio102 E102 = new Ejercicio102();

        int opcionBas1 = 0;

        do {

            System.out.println("1. Hola mundo: imprime tu nombre y edad" + "\n" +
                    "2. Calculadora de las 4 operaciones" + "\n" +
                    "3. Par o impar" + "\n" +
                    "4. Mayor de tres números" + "\n" +
                    "5. Convertir °C a °F" + "\n" +
                    "6. Año bisiesto" + "\n" +
                    "7. Tabla de multiplicar de un número" + "\n" +
                    "8. FizzBuzz" + "\n" +
                    "9. Suma de 1 a n" + "\n" +
                    "10. ¿Es número primo?" + "\n" +
                    "11. Invertir los dígitos de un número (1234 → 4321)" + "\n" +
                    "12. Adivina el número con while y menú con switch" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionBas1 = entradaBas1.nextInt();

            switch (opcionBas1) {
                case 1:
                    E91.main(args);
                    break;
                case 2:
                    E92.main(args);
                    break;
                case 3:
                    E93.main(args);
                    break;
                case 4:
                    E94.main(args);
                    break;
                case 5:
                    E95.main(args);
                    break;
                case 6:
                    E96.main(args);
                    break;
                case 7:
                    E97.main(args);
                    break;
                case 8:
                    E98.main(args);
                    break;
                case 9:
                    E99.main(args);
                    break;
                case 10:
                    E100.main(args);
                    break;
                case 11:
                    E101.main(args);
                    break;
                case 12:
                    E102.main(args);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcionBas1 != 0);

    }

}
