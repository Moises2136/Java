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
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcionBas1 != 0);

    }

}
