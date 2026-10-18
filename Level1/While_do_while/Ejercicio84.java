package Level1.While_do_while;

/**
 * Clase Invertir un número (1234 → 4321)
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio84 {
    public static void main(String[] args) {

        int n = 1234;
        int valI = 0;

        while (n > 0) {
            int digito = n % 10;
            valI = valI * 10 + digito;
            n /= 10;
        }

        System.out.println(valI);

    }
}
