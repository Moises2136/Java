package Level1.Division_y_Modulos;

/**
 * Clase que Repartir una cuenta entre n personas
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio47 {

    /**
     * Metodo main que imprime el resultado de una division
     * @param personas valor int
     * @param cuenta valor double 
     */
    public static void main(String[] args) {

        int personas = 4;
        double cuenta = 1500.00;

        System.out.println("Cada persona debe pagar: " + (cuenta/personas));

    }
}
