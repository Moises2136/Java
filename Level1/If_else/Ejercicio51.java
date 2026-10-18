package Level1.If_else;
import java.util.Scanner;
/**
 * Clase que Positivo, negativo o cero
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio51 {

    /**
     * Metodo main que dice si un numero es positivo, negativo o 0
     * @param num valor int
     * @param entradaNum entarda del usaurio 
     */
    public static void main(String[] args) {

        Scanner entradaNum = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");

        int num = entradaNum.nextInt();

        if (num == 0){
            System.out.println("Es un cero " + num);
        } else if (num < 0){
            System.out.println("Es un numero negativo " + num);
        } else if (num > 0) {
            System.out.println("Es un numero positivo " + num);
        }

    }
}
