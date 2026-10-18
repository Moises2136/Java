package Level1.Multiplicacion;

/**
 * Clase que Qué pasa al multiplicar dos int muy grandes (desbordamiento); arréglalo con long
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio40 {

    /**
     * Metodo main que imprime el resultado de una multiplicación
     * @param val1 valor int
     * @param val2 valor int 
     * @param resultado valor grnade de una multiplicación con long
     */
    public static void main(String[] args) {

        long val1 = 9000000;
        long val2 = 8000000;

        long resultado = val1 * val2;

        System.out.println("El resultado de un valor grande es: " + resultado);

    }
}
