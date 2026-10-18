package Level1.Division_y_Modulos;

/**
 * Clase que obtiene el Par o impar usando %
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio45 {

    /**
     * Metodo main que imprime el resultado de una division
     * @param val1 valor int
     * @param resultado para saber si es par o impar
     */
    public static void main(String[] args) {

        int val1 = 50;

        int resultado = val1 % 2;

        if(resultado == 0) System.out.println("Es par");
            else System.out.println("Es impar");

    }
}
