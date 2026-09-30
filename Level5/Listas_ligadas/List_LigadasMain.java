package Level5.Listas_ligadas;

import java.util.Scanner;

public class List_LigadasMain {

    public static void main(String[] args) {

        Scanner entradaList_lig = new Scanner(System.in);

        Ejercicio281 E281 = new Ejercicio281();
        Ejercicio282 E282 = new Ejercicio282();
        Ejercicio283 E283 = new Ejercicio283();
        Ejercicio284 E284 = new Ejercicio284();
        Ejercicio285 E285 = new Ejercicio285();
        Ejercicio286 E286 = new Ejercicio286();
        Ejercicio287 E287 = new Ejercicio287();
        Ejercicio288 E288 = new Ejercicio288();
        Ejercicio289 E289 = new Ejercicio289();
        Ejercicio290 E290 = new Ejercicio290();

        int opcionList_lig = 0;

        do {

            System.out.println("1. Clase Nodo" + "\n" +
                    "2. Insertar al inicio y al final" + "\n" +
                    "3. Imprimir la lista" + "\n" +
                    "4. Buscar un elemento" + "\n" +
                    "5. Eliminar un elemento" + "\n" +
                    "6. Tamaño de la lista" + "\n" +
                    "7. Invertir la lista" + "\n" +
                    "8. Elemento de en medio" + "\n" +
                    "9. Detectar ciclo" + "\n" +
                    "10. Lista doblemente ligada" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionList_lig = entradaList_lig.nextInt();

            switch (opcionList_lig) {
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

        } while (opcionList_lig != 0);

    }

}
