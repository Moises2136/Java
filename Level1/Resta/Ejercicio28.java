package Level1.Resta;

/**
 * Clase que obtiene un Valor absoluto de una resta con Math.abs
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio28 {

    /**
     * Metodo obtiene un valor absoluto con math
     *
     * @param val1   valor int de un numero
     * @param val2   valor double de un numero
     * @param double valor double de un numero
     */
    public static void main(String[] args) {
        int val1 = 56;
        double val2 = 79.09;

        double resultado;

        resultado = Math.abs(val1 - val2);

        System.out.println("El resultado del valor absoluto es: " + resultado);
    }
}
