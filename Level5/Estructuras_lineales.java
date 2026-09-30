package Level5;

import java.util.Scanner;

import Level5.Basico.Basico5Main;
import Level5.Colas.ColasMain;
import Level5.HashMap_y_HashSet.HMHSMain;
import Level5.Listas_ligadas.List_LigadasMain;
import Level5.Pilas.PilasMain;

public class Estructuras_lineales {
    public static void main(String[] args) {

        Scanner entradaELScanner = new Scanner(System.in);

        int opcionEL = 0;

        do {

            System.out.println("Bienvenido al programa de Estructuras Lineales en Java.");
            System.out.println("1. Listas Ligadas" + "\n" +
                    "2. Pilas" + "\n" +
                    "3. Colas" + "\n" +
                    "4. HasoMap y HashSet" + "\n" +
                    "5. Extras" + "\n" + "0.Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionEL = entradaELScanner.nextInt();

            switch (opcionEL) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcionEL != 0);
    }
}