package Level1.Multiplicacion;
import java.util.Scanner;
/**
 * Clase que multiplica dos numeros de entrada por el usuario
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio32 {

    /**
     * Metodo main que imprime el resultado de una multiplicación
     * @param val1 valor int
     * @param val2 valor int 
     * @param entradaUm entrada de valores por el usaurio
     */
    public static void main(String[] args) {

        Scanner entradaUm = new Scanner(System.in);

        int val1 = 0;
        int val2 = 0;

        System.out.println("Introduce el primer valor para multiplicar");
        val1 = entradaUm.nextInt();

        System.out.println("Introduce el segundo valor para multitplicar");
        val2 = entradaUm.nextInt();

        System.out.println("El resultado es: " + (val1 * val2));

    }
}
