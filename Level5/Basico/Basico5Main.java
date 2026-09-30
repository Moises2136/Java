package Level5.Basico;

import java.util.Scanner;

public class Basico5Main {

    public static void main(String[] args) {

        Scanner entradaBasico5 = new Scanner(System.in);

        int opcionBasico5 = 0;

        do {

            System.out.println("Seleccione una opción del menú:");

            opcionBasico5 = entradaBasico5.nextInt();

            switch (opcionBasico5) {
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

        } while (opcionBasico5 != 0);

    }

}
