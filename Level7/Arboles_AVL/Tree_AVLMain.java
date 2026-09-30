package Level7.Arboles_AVL;

import java.util.Scanner;

public class Tree_AVLMain {

    public static void main(String[] args) {

        Scanner entradaTreeAVL = new Scanner(System.in);

        Ejercicio418 E418 = new Ejercicio418();
        Ejercicio419 E419 = new Ejercicio419();
        Ejercicio420 E420 = new Ejercicio420();
        Ejercicio421 E421 = new Ejercicio421();
        Ejercicio422 E422 = new Ejercicio422();
        Ejercicio423 E423 = new Ejercicio423();
        Ejercicio424 E424 = new Ejercicio424();
        Ejercicio425 E425 = new Ejercicio425();
        Ejercicio426 E426 = new Ejercicio426();
        Ejercicio427 E427 = new Ejercicio427();

        int opcionTreeAVL = 0;

        do {

            System.out.println("1. Calcular factor de balance" + "\n" +
                    "2. Rotación simple a la derecha" + "\n" +
                    "3. Rotación simple a la izquierda" + "\n" +
                    "4. Rotación doble izquierda-derecha" + "\n" +
                    "5. Rotación doble derecha-izquierda" + "\n" +
                    "6. Insertar con balanceo" + "\n" +
                    "7. Eliminar con balanceo" + "\n" +
                    "8. Validar si un árbol es AVL" + "\n" +
                    "9. Imprimir el árbol con alturas" + "\n" +
                    "10. Comparar AVL vs árbol sin balancear" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionTreeAVL = entradaTreeAVL.nextInt();

            switch (opcionTreeAVL) {
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

        } while (opcionTreeAVL != 0);

    }

}
