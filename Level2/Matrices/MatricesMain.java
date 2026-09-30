package Level2.Matrices;

import java.util.Scanner;

public class MatricesMain {

    public static void main(String[] args) {

        Scanner entradaMatrices = new Scanner(System.in);

        Ejercicio133 E133 = new Ejercicio133();
        Ejercicio134 E134 = new Ejercicio134();
        Ejercicio135 E135 = new Ejercicio135();
        Ejercicio136 E136 = new Ejercicio136();
        Ejercicio137 E137 = new Ejercicio137();
        Ejercicio138 E138 = new Ejercicio138();
        Ejercicio139 E139 = new Ejercicio139();
        Ejercicio140 E140 = new Ejercicio140();
        Ejercicio141 E141 = new Ejercicio141();
        Ejercicio142 E142 = new Ejercicio142();

        int opcionMatrices = 0;

        do {

            System.out.println("1. Llenar e imprimir una matriz" + "\n" +
                    "2. Suma de todos los elementos" + "\n" +
                    "3. Suma por filas y columnas" + "\n" +
                    "4. Diagonal principal" + "\n" +
                    "5. Transpuesta" + "\n" +
                    "6. Suma de dos matrices" + "\n" +
                    "7. Multiplicación de matrices" + "\n" +
                    "8. ¿Hubo lotería?" + "\n" +
                    "9. Buscar un valor en la matriz" + "\n" +
                    "10. Gato (tres en raya): detectar ganador" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionMatrices = entradaMatrices.nextInt();

            switch (opcionMatrices) {
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

        } while (opcionMatrices != 0);

    }

}
