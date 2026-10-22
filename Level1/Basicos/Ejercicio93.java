package Level1.Basicos;

import java.util.Scanner;

/**
 * Clase Par o impar
 * 
 * @author Moisés
 * @version 1.0
 */

public class Ejercicio93 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numE;
        int resultado;

        System.out.println("Introduce el numero para saber si es par o impar: ");
        numE = entrada.nextInt();

        resultado = numE % 2;

        if (resultado == 0)
            System.out.println("Es par");
        else
            System.out.println("Es impar");
    }
}
