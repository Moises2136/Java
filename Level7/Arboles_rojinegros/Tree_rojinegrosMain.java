package Level7.Arboles_rojinegros;

import java.util.Scanner;

public class Tree_rojinegrosMain {

    public static void main(String[] args) {

        Scanner entradaTree_rn = new Scanner(System.in);

        Ejercicio428 E428 = new Ejercicio428();
        Ejercicio429 E429 = new Ejercicio429();
        Ejercicio430 E430 = new Ejercicio430();
        Ejercicio431 E431 = new Ejercicio431();
        Ejercicio432 E432 = new Ejercicio432();
        Ejercicio433 E433 = new Ejercicio433();
        Ejercicio434 E434 = new Ejercicio434();
        Ejercicio435 E435 = new Ejercicio435();
        Ejercicio436 E436 = new Ejercicio436();
        Ejercicio437 E437 = new Ejercicio437();

        int opcionTree_rn = 0;

        do {

            System.out.println("1. Clase Nodo con color" + "\n" +
                    "2. Validar las 5 propiedades" + "\n" +
                    "3. Rotaciones" + "\n" +
                    "4. Insertar sin balancear" + "\n" +
                    "5. Caso 1 de inserción: tío rojo" + "\n" +
                    "6. Casos 2 y 3: tío negro" + "\n" +
                    "7. Inserción completa" + "\n" +
                    "8. Eliminar: casos simples" + "\n" +
                    "9. Eliminación completa" + "\n" +
                    "10. Comparar rojinegro vs AVL" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionTree_rn = entradaTree_rn.nextInt();

            switch (opcionTree_rn) {
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

        } while (opcionTree_rn != 0);

    }

}
