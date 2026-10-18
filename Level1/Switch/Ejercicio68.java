package Level1.Switch;

import java.util.Scanner;

/**
 * Clase Convertidor de unidades con menú
 * 
 * @author Moisés
 * @version 1.0
 */

public class Ejercicio68 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Convertidor de unidades");

        System.out.println("1. Centenas a decenas" + "\n" + "2.Decenas a unidades");

        int op = entrada.nextInt();
        int val;

        switch (op) {
            case 1:
                System.out.println("Introduce el valor: ");
                val = entrada.nextInt();
                val = val * 10;
                System.out.println("Son " + val + " decenas");
                break;
            case 2:
                System.out.println("Introduce el valor: ");
                val = entrada.nextInt();
                val = val * 10;
                System.out.println("Son " + val + " unidades");
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }

    }
}
