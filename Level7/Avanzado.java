package Level7;

import java.util.Scanner;

import Level7.Arboles_AVL.Tree_AVLMain;
import Level7.Arboles_rojinegros.Tree_rojinegrosMain;
import Level7.Backtracking.BacktrackingMain;
import Level7.Basico.Basico7Main;
import Level7.Estructuras_avanzadas.Estruc_avanzadas_Main;
import Level7.Programacion_Dinamica.Pro_dinamica_Main;

public class Avanzado {
    public static void main(String[] args) {

        Scanner entradaAScanner = new Scanner(System.in);

        int opcionA = 0;

        do {

            System.out.println("Bienvenido al programa de Programación Avanzada en Java.");
            System.out.println("1. Programación Dinamica" + "\n" +
                    "2. Backtracking" + "\n" +
                    "3. Estructuras avanzadas" + "\n" +
                    "4. Árboles AVL" + "\n" +
                    "5. Árboles rojinegros" + "\n" +
                    "6. Extras" + "\n" + "0.Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionA = entradaAScanner.nextInt();

            switch (opcionA) {
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

        } while (opcionA != 0);

    }
}