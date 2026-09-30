package Level2;

import java.util.Scanner;
import Level2.ArrayList.ArrayListMain;
import Level2.Arreglos.ArreglosMain;
import Level2.Basico.Basico2Main;
import Level2.Matrices.MatricesMain;
import Level2.Strings.StringsMain;
import Level2.Strings_y_StringBuilder.SSBuildeMain;

public class Arrays_Strings {
    public static void main(String[] args) {
        Scanner entradaASScanner = new Scanner(System.in);

        int opcionAS = 0;

        do {

            System.out.println("Bienvenido al programa de Arrays y Strings en Java.");
            System.out.println("1. Arreglos" + "\n" +
                    "2. Strings Basicos" + "\n" +
                    "3. Métodos de String y StringBuilder" + "\n" +
                    "4. Matrices" + "\n" +
                    "5. ArrayList" + "\n" +
                    "6. Extras" + "\n" + "0.Salir");

            System.out.println("Seleccione una opción del menú:");
            opcionAS = entradaASScanner.nextInt();

            switch (opcionAS) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcionAS != 0);

    }
}