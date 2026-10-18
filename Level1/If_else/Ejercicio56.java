package Level1.If_else;

import java.util.Scanner;

/**
 * Clase Año bisiesto
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio56 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a_Bisisesto = entrada.nextInt();

        if (a_Bisisesto % 4 == 0 && a_Bisisesto % 100 != 0 || a_Bisisesto % 400 == 0) {
            System.out.println(a_Bisisesto + " es bisiesto");
        } else {
            System.out.println(a_Bisisesto + " no es bisiesto");
        }

    }
}
