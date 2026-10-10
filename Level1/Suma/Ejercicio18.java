package Level1.Suma;

/**
 * Clase que suma Calcula el total de una compra de 3 productos
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio18 {

    /**
     * Metodo para tener el total de 3 productos
     *
     * @param producto1 tiene un valor de int un numero
     * @param producto2 tiene un valor de int un numero
     * @param producto3 tiene un valor de int un numero
     */
    public static void main(String[] args) {

        double producto1 = 109.78;
        double producto2 = 122.37;
        double producto3 = 456.09;

        double resultadop = producto1 + producto2 + producto3;

        System.out.printf("El resultado de 3 productos es: %.2f%n", resultadop);

    }
}
