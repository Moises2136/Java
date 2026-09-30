package Level6;

import java.util.Scanner;

import Level6.Arbol_binario_de_busqueda.Tree_Bin_BusquedaMain;
import Level6.Arboles_binarios.Tree_BinMain;
import Level6.Basico.Basico6Main;
import Level6.Grafos.GrafosMain;
import Level6.Heaps.HeapsMain;

public class Arboles_Grafos {
    public static void main(String[] args) {

        Scanner entradaAGScanner = new Scanner(System.in);

        int opcionAG = 0;

        do {

            System.out.println("Bienvenido al programa de Arboles y Grafos en Java.");
            System.out.println("1. Arboles Binarios" + "\n" +
                    "2. Arbol Binario de Busqueda" + "\n" +
                    "3. Heaps" + "\n" +
                    "4. Grafos" + "\n" +
                    "5. Extras" + "\n" + "0.Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionAG = entradaAGScanner.nextInt();

            switch (opcionAG) {
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

        } while (opcionAG != 0);
    }
}