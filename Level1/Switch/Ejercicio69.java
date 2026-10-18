package Level1.Switch;

import java.util.Scanner;

/**
 * Clase Piedra, papel o tijera contra valores fijos
 * 
 * @author Moisés
 * @version 1.0
 */

public class Ejercicio69 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Piedra, Papel o Tijera");

        String op = entrada.nextLine();
        String opC = "Tijera";

        switch (op) {
            case "Piedra":
                System.out.println("Saque " + opC + " Perdi");
                break;
            case "Papel":
                System.out.println("Saque" + opC + " Gane");
                break;
            case "Tijera":
                System.out.println("Saque" + opC + "Empatamos");
                break;
            default:
                System.out.println("Opción invalida");
                break;
        }

    }
}
