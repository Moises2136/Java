package Level1.Multiplicacion;

import java.util.Scanner;

import Level1.Multiplicacion.*;

public class MultiMain {

    public static void main(String[] args) {

        Scanner entradaMulti = new Scanner(System.in);

        Ejercicio31 E31 = new Ejercicio31();
        Ejercicio32 E32 = new Ejercicio32();
        Ejercicio33 E33 = new Ejercicio33();
        Ejercicio34 E34 = new Ejercicio34();
        Ejercicio35 E35 = new Ejercicio35();
        Ejercicio36 E36 = new Ejercicio36();
        Ejercicio37 E37 = new Ejercicio37();
        Ejercicio38 E38 = new Ejercicio38();
        Ejercicio39 E39 = new Ejercicio39();
        Ejercicio40 E40 = new Ejercicio40();

        int opcionMulti = 0;

        do {

            System.out.println("1. Multiplica dos números fijos" + "\n" +
                    "2. Multiplica dos números del usuario" + "\n" +
                    "3. Área de un rectángulo" + "\n" +
                    "4. Doble y triple de un número" + "\n" +
                    "5. Multiplica usando *=" + "\n" +
                    "6. Cuadrado y cubo de un número" + "\n" +
                    "7. Precio total: cantidad × precio unitario" + "\n" +
                    "8. Convertir horas a minutos y segundos" + "\n" +
                    "9. Sueldo semanal: horas × pago por hora" + "\n" +
                    "10. Qué pasa al multiplicar dos int muy grandes (desbordamiento); arréglalo con long" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionMulti = entradaMulti.nextInt();

            switch (opcionMulti) {
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

        } while (opcionMulti != 0);

    }

}
