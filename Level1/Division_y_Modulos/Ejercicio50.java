package Level1.Division_y_Modulos;

/**
 * Clase que Convertir un double a int (casting) y ver qué se pierde
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio50 {
    public static void main(String[] args) {
        double numero = 89.99;
        int entero = (int) numero;

        System.out.printf("Numero original: %.2f%nNumero casting: %d%n", numero, entero);
    }
}
