package Level1.Basicos;

import java.util.Scanner;

/**
 * Clase Adivina el número con while y menú con switch
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio102 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int op;

        do {

            System.out.println("Menu" + "\n" + "1. Jugar" + "\n" + "0. Salir");
            System.out.println("Elige una opcion: ");
            op = entrada.nextInt();

            switch (op) {
                case 1: {
                    int secreto = (int) (Math.random() * 20) + 1;
                    int val = 0;
                    int intentos = 0;

                    System.out.println("Adivina el numero del 1 al 20");

                    while (val != secreto) {
                        System.out.println("Tu intento: ");
                        val = entrada.nextInt();
                        intentos++;

                        if (val < secreto) {
                            System.out.println("El numero es mayor");
                        } else if (val > secreto) {
                            System.out.println("El numero es menor");
                        }
                    }

                    System.out.println("Adivinaste el numero " + secreto + " en " + intentos + " intentos");
                    break;
                }
                case 0:
                    System.out.println("Saliendo ...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while (op != 0);

    }
}