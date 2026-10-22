package Level1.Basicos;

import java.util.Scanner;

/**
 * Clase Invertir los dígitos de un número (1234 → 4321)
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio101 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero a invertir: ");
        int val = entrada.nextInt();

        int valI = 0;

        while (val > 0) {
            int digito = val % 10;
            valI = valI * 10 + digito;
            val /= 10;
        }

        System.out.println("Numero invertido: " + valI);
    }
}
