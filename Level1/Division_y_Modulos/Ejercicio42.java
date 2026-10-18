package Level1.Division_y_Modulos;

/**
 * Clase que División entera vs. decimal: 7 / 2 contra 7.0 / 2
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio42 {

    /**
     * Metodo main que imprime el resultado de una division
     * @param val1e valor int
     * @param val2e valor int 
     * @param val1d valor double
     * @param val2d valor double 
     */
    public static void main(String[] args) {

        int val1e = 7;
        int val2e = 2;

        double val1d = 7.00;
        double val2d = 2.00;

        System.out.println("Division de dos enteros es: " + (val1e/val2e));
        System.out.println("Division de dos decimales es: " + (val1d/val2d));

    }
}
