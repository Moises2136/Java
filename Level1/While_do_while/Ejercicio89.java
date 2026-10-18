package Level1.While_do_while;

import java.util.Scanner;

/**
 * Clase Contar cuántos dígitos tiene un número
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio89 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num = 1;
        int contador = 0;
        int valSeparado = 0;

        System.out.println("Introduce un numero para contar sus digitos: ");
        num = entrada.nextInt();

        int numSalvado = num;

        do {
            valSeparado += num % 10;
            num = num / 10;
            contador++;
        } while (num != 0);

        System.out.println("Hay " + contador + " digitos en " + numSalvado);

    }
}
