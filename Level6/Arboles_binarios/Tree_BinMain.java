package Level6.Arboles_binarios;

import java.util.Scanner;

public class Tree_BinMain {

    public static void main(String[] args) {

        Scanner entradaTreeB = new Scanner(System.in);

        Ejercicio334 E334 = new Ejercicio334();
        Ejercicio335 E335 = new Ejercicio335();
        Ejercicio336 E336 = new Ejercicio336();
        Ejercicio337 E337 = new Ejercicio337();
        Ejercicio338 E338 = new Ejercicio338();
        Ejercicio339 E339 = new Ejercicio339();
        Ejercicio340 E340 = new Ejercicio340();
        Ejercicio341 E341 = new Ejercicio341();
        Ejercicio342 E342 = new Ejercicio342();
        Ejercicio343 E343 = new Ejercicio343();

        int opcionTreeB = 0;

        do {

            System.out.println("1. Clase Nodo y árbol" + "\n" +
                    "2. Recorrido preorden" + "\n" +
                    "3. Inorden" + "\n" +
                    "4. Postorden" + "\n" +
                    "5. Por niveles" + "\n" +
                    "6. Altura" + "\n" +
                    "7. Contar nodos" + "\n" +
                    "8. Contar hojas" + "\n" +
                    "9. Árbol espejo" + "\n" +
                    "10. ¿Dos árboles son iguales?" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionTreeB = entradaTreeB.nextInt();

            switch (opcionTreeB) {
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

        } while (opcionTreeB != 0);

    }

}
