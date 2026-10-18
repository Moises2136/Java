package Level1.If_else;
import java.util.Scanner;
/**
 * Clase Mayor de edad o no
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio52 {

    /**
     * Metodo main que dice si eres mayor o menor de edad
     * @param edad edad del usuario
     * @param entradaEdad entrada del usaurio 
     */
    public static void main(String[] args) {

        Scanner entradaEdad = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = entradaEdad.nextInt();

        if (edad < 18) {
            System.out.println("Eres menor de edad");
        } else {
            System.out.println("Eres mayor de edad");
        }
    }
}
