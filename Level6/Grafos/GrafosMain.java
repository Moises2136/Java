package Level6.Grafos;

import java.util.Scanner;

public class GrafosMain {

    public static void main(String[] args) {

        Scanner entradaGrafos = new Scanner(System.in);

        Ejercicio364 E364 = new Ejercicio364();
        Ejercicio365 E365 = new Ejercicio365();
        Ejercicio366 E366 = new Ejercicio366();
        Ejercicio367 E367 = new Ejercicio367();
        Ejercicio368 E368 = new Ejercicio368();
        Ejercicio369 E369 = new Ejercicio369();
        Ejercicio370 E370 = new Ejercicio370();
        Ejercicio371 E371 = new Ejercicio371();
        Ejercicio372 E372 = new Ejercicio372();
        Ejercicio373 E373 = new Ejercicio373();

        int opcionGrafos = 0;

        do {

            System.out.println("1. Matriz de adyacencia" + "\n" +
                    "2. Lista de adyacencia" + "\n" +
                    "3. BFS" + "\n" +
                    "4. DFS" + "\n" +
                    "5. Contar componentes conexas" + "\n" +
                    "6. Detectar ciclo" + "\n" +
                    "7. Camino más corto sin pesos (BFS)" + "\n" +
                    "8. Ordenamiento topológico" + "\n" +
                    "9. Dijkstra" + "\n" +
                    "10. Contar islas en una matriz" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionGrafos = entradaGrafos.nextInt();

            switch (opcionGrafos) {
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

        } while (opcionGrafos != 0);

    }

}
