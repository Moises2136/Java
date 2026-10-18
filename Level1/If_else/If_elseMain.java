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
            System.out.println(" --------------------------- IF_ELSE --------------------------- ");
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
                E51.main(args);
                break;
                case 2:
                E52.main(args);
                break;
                case 3:
                E53.main(args);
                break;
                case 4:
                E54.main(args);
                break;
                case 5:
                E55.main(args);
                break;
                case 6:
                E56.main(args);
                break;
                case 7:
                E57.main(args);
                break;
                case 8:
                E58.main(args);
                break;
                case 9:
                E59.main(args);
                break;
                case 10:
                E60.main(args);
                break;
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcionIfelse != 0);

    }

}
