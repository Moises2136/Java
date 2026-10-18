package Level1.While_do_while;

import java.util.Scanner;

/**
 * Clase Menú con do-while
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio88 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int op = 0;

        do {

            System.out.println(
                    "Elije una opción" + "\n 1.Opción 1" + "\n 2.Opción 2" + "\n 3.Opción 3"
                            + "\n 10.Opción 10(Salir)");
            op = entrada.nextInt();

            System.out.println("Elegiste la opcion: " + op);

        } while (op != 10);

        System.out.println("Saliste del menu");

    }
}
