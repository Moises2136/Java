package Level1.Suma;

/**
 * Clase que suma dos valores con +=
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio16 {

    /**
     * Metodo para sumar dos valores con +=
     *
     * @param num1 tiene un valor de int un numero
     * @param num2 tiene un valor de int un numero y guarda el nuevo valor de la
     *             suma +=
     */
    public static void main(String[] args) {
        int num1 = 102;
        int num2 = 340;
        num2 += num1;

        System.out.println("El resultado de la suma +=  es: " + num2);

    }
}
