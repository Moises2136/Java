package Level6.Arbol_binario_de_busqueda;

import java.util.Scanner;

public class Tree_Bin_BusquedaMain {

    public static void main(String[] args) {

        Scanner entradaTreeBB = new Scanner(System.in);

        Ejercicio344 E344 = new Ejercicio344();
        Ejercicio345 E345 = new Ejercicio345();
        Ejercicio346 E346 = new Ejercicio346();
        Ejercicio347 E347 = new Ejercicio347();
        Ejercicio348 E348 = new Ejercicio348();
        Ejercicio349 E349 = new Ejercicio349();
        Ejercicio350 E350 = new Ejercicio350();
        Ejercicio351 E351 = new Ejercicio351();
        Ejercicio352 E352 = new Ejercicio352();
        Ejercicio353 E353 = new Ejercicio353();

        int opcionTreeBB = 0;

        do {

            System.out.println("1. Insertar" + "\n" +
                    "2. Buscar" + "\n" +
                    "3. Mínimo y máximo" + "\n" +
                    "4. Eliminar hoja" + "\n" +
                    "5. Eliminar nodo con un hijo" + "\n" +
                    "6. Eliminar nodo con dos hijos" + "\n" +
                    "7. Validar si es de búsqueda" + "\n" +
                    "8. k-ésimo menor" + "\n" +
                    "9. Ancestro común más bajo" + "\n" +
                    "10. Arreglo ordenado a árbol balanceado" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionTreeBB = entradaTreeBB.nextInt();

            switch (opcionTreeBB) {
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

        } while (opcionTreeBB != 0);

    }

}
