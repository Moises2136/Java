package Level2.ArrayList;

import java.util.Scanner;

public class ArrayListMain {

    public static void main(String[] args) {

        Scanner entradaAList = new Scanner(System.in);

        Ejercicio143 E143 = new Ejercicio143();
        Ejercicio144 E144 = new Ejercicio144();
        Ejercicio145 E145 = new Ejercicio145();
        Ejercicio146 E146 = new Ejercicio146();
        Ejercicio147 E147 = new Ejercicio147();
        Ejercicio148 E148 = new Ejercicio148();
        Ejercicio149 E149 = new Ejercicio149();
        Ejercicio150 E150 = new Ejercicio150();
        Ejercicio151 E151 = new Ejercicio151();
        Ejercicio152 E152 = new Ejercicio152();

        int opcionALists = 0;

        do {

            System.out.println("1. Crear, agregar e imprimir" + "\n" +
                    "2. Eliminar un elemento" + "\n" +
                    "3. Buscar con contains" + "\n" +
                    "4. Ordenar con Collections.sort" + "\n" +
                    "5. Sumar elementos" + "\n" +
                    "6. Filtrar pares a otra lista" + "\n" +
                    "7. Lista de compras con menú" + "\n" +
                    "8. Quitar duplicados" + "\n" +
                    "9. Unir dos listas" + "\n" +
                    "10. Lista de nombres ordenada alfabéticamente" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionALists = entradaAList.nextInt();

            switch (opcionALists) {
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

        } while (opcionALists != 0);

    }

}
