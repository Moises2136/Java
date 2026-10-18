package Level1.Switch;

import java.util.Scanner;

/**
 * Clase Menú de restaurante con precios
 * 
 * @author Moisés
 * @version 1.0
 */

public class Ejercicio67 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Menu" + "\n" +
                "1. Hamburgesa $200" + "\n" +
                "2. Hot Dog $50" + "\n" +
                "3. Papas a la francesa $30" + "\n" +
                "4. Pizza $99" + "\n" +
                "5. Postre $45");

        System.out.println("Introduce tu opcion: ");
        int orden = entrada.nextInt();

        switch (orden) {
            case 1:
                System.out.println("Hamburguesa comprada");
                break;
            case 2:
                System.out.println("Hot Dog comprado");
                break;
            case 3:
                System.out.println("Papas a la francesa compradas");
                break;
            case 4:
                System.out.println("Pizza comprada");
                break;
            case 5:
                System.out.println("Postre comprado");
                break;
            default:
                System.out.println("Opción invalida");
                break;
        }

    }
}
