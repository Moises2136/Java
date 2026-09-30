package Level6.Basico;

import java.util.Scanner;

public class Basico6Main {

    public static void main(String[] args) {

        Scanner entradaBasico6 = new Scanner(System.in);

        Ejercicio374 E374 = new Ejercicio374();
        Ejercicio375 E375 = new Ejercicio375();
        Ejercicio376 E376 = new Ejercicio376();
        Ejercicio377 E377 = new Ejercicio377();
        Ejercicio378 E378 = new Ejercicio378();
        Ejercicio379 E379 = new Ejercicio379();
        Ejercicio380 E380 = new Ejercicio380();
        Ejercicio381 E381 = new Ejercicio381();
        Ejercicio382 E382 = new Ejercicio382();
        Ejercicio383 E383 = new Ejercicio383();
        Ejercicio384 E384 = new Ejercicio384();
        Ejercicio385 E385 = new Ejercicio385();
        Ejercicio386 E386 = new Ejercicio386();
        Ejercicio387 E387 = new Ejercicio387();

        int opcionBasico6 = 0;

        do {

            System.out.println("1. Nodo y árbol binario" + "\n" +
                    "2. Recorridos inorden, preorden y postorden" + "\n" +
                    "3. Recorrido por niveles" + "\n" +
                    "4. Altura de un árbol" + "\n" +
                    "5. Árbol binario de búsqueda insertar y buscar" + "\n" +
                    "6. Árbol binario de búsqueda eliminar" + "\n" +
                    "7. Validar si un árbol es de búsqueda" + "\n" +
                    "8. Ancestro común más bajo" + "\n" +
                    "9. Min-heap desde cero" + "\n" +
                    "10. Heap sort" + "\n" +
                    "11. Grafo con lista de adyacencia" + "\n" +
                    "12. BFS y DFS" + "\n" +
                    "13. Detectar ciclo en un grafo" + "\n" +
                    "14. Dijkstra" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionBasico6 = entradaBasico6.nextInt();

            switch (opcionBasico6) {
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
                case 11:
                case 12:
                case 13:
                case 14:
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcionBasico6 != 0);

    }

}
