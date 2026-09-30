package Level4;

import java.util.Scanner;

import Level4.Recursion.RecursionMain;
import Level4.Ordenamiento.OrdenamientoMain;
import Level4.Busqueda.BusquedaMain;
import Level4.Basico.Basico4Main;

public class Recursion_Busqueda_Ordenamiento {
    public static void main(String[] args) {

        Scanner entradaRBOScanner = new Scanner(System.in);

        int opcionRBO = 0;

        do {

            System.out.println("Bienvenido al programa de Recursión, Búsqueda y Ordenamiento en Java.");
            System.out.println("1. Recursion" + "\n" +
                    "2. Busqueda" + "\n" +
                    "3. Oredenamiento" + "\n" +
                    "4. Extras" + "\n" + "0.Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionRBO = entradaRBOScanner.nextInt();

            switch (opcionRBO) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcionRBO != 0);

    }
}