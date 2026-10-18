package Level1.Division_y_Modulos;

/**
 * Clase que Separar los dígitos de un número de 3 cifras con / y %
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio49 {

    /**
     * Metodo main que imprime el resultado
     * @param num3 valor int
     * @param centenas valor int 
     * @param decenas valor int 
     * @param unidades valor int 
     */
    public static void main(String[] args) {

        int num3 = 123;

        int centenas = num3/100;
        int decenas = (num3%100)/10;
        int unidades = num3%10;

        System.out.printf("Centenas: %d%n Decenas: %d%n Unidades: %d%n", centenas, decenas, unidades);

    }
}
