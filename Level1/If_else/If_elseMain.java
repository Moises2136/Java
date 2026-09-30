package Level1.If_else;

import java.util.Scanner;

import Level1.If_else.*;

public class If_elseMain {

    public static void main(String[] args) {

        Scanner entradaIfelse = new Scanner(System.in);

        Ejercicio51 E51 = new Ejercicio51();
        Ejercicio52 E52 = new Ejercicio52();
        Ejercicio53 E53 = new Ejercicio53();
        Ejercicio54 E54 = new Ejercicio54();
        Ejercicio55 E55 = new Ejercicio55();
        Ejercicio56 E56 = new Ejercicio56();
        Ejercicio57 E57 = new Ejercicio57();
        Ejercicio58 E58 = new Ejercicio58();
        Ejercicio59 E59 = new Ejercicio59();
        Ejercicio60 E60 = new Ejercicio60();

        int opcionIfelse = 0;

        do {

            System.out.println("1. Positivo, negativo o cero" + "\n" +
                    "2. Mayor de edad o no" + "\n" +
                    "3. Mayor de dos números" + "\n" +
                    "4. Mayor de tres números" + "\n" +
                    "5. Aprobado o reprobado según calificación" + "\n" +
                    "6. Año bisiesto" + "\n" +
                    "7. Calificación numérica a letra (A, B, C…)" + "\n" +
                    "8. Triángulo equilátero, isósceles o escaleno" + "\n" +
                    "9. Login simple: usuario y contraseña correctos" + "\n" +
                    "10. Tarifa de cine según edad y día" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionIfelse = entradaIfelse.nextInt();

            switch (opcionIfelse) {
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

        } while (opcionIfelse != 0);

    }

}
