package Level7.Estructuras_avanzadas;

import java.util.Scanner;

public class Estruc_avanzadas_Main {

    public static void main(String[] args) {

        Scanner entradaEA = new Scanner(System.in);

        Ejercicio408 E408 = new Ejercicio408();
        Ejercicio409 E409 = new Ejercicio409();
        Ejercicio410 E410 = new Ejercicio410();
        Ejercicio411 E411 = new Ejercicio411();
        Ejercicio412 E412 = new Ejercicio412();
        Ejercicio413 E413 = new Ejercicio413();
        Ejercicio414 E414 = new Ejercicio414();
        Ejercicio415 E415 = new Ejercicio415();
        Ejercicio416 E416 = new Ejercicio416();
        Ejercicio417 E417 = new Ejercicio417();

        int opcionEA = 0;

        do {

            System.out.println("1. Trie: insertar" + "\n" +
                    "2. Trie: buscar" + "\n" +
                    "3. Trie: autocompletar" + "\n" +
                    "4. Union-Find básico" + "\n" +
                    "5. Union-Find con compresión de caminos" + "\n" +
                    "6. Kruskal" + "\n" +
                    "7. Prim" + "\n" +
                    "8. Árbol de segmentos" + "\n" +
                    "9. LRU Cache" + "\n" +
                    "10. Bloom filter sencillo" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionEA = entradaEA.nextInt();

            switch (opcionEA) {
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

        } while (opcionEA != 0);

    }

}
