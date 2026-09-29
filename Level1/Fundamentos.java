package Level1;

import java.util.Scanner;
import Level1.Imprimir.ImprimirMain;

public class Fundamentos {
    public static void main(String[] args) {

        Scanner entradaFScanner = new Scanner(System.in);

        int opcionF = 0;

        do {

            System.out.println("Bienvenido al programa de fundamentos de Java.");
            System.out.println("1. Imprimir" + "\n" + "2. Imprimir" + "\n");

            System.out.println("Seleccione una opción del menú:");

            opcionF = entradaFScanner.nextInt();

        } while (opcionF == 12);
    }
}