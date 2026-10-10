package Level1.Resta;

import java.util.Scanner;

/**
 * Clase que calcula el cambio de una compra
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio23 {

    /**
     * Meotodo que calcular el cambio de una compra
     *
     * @param entradaU     valor de entrada del usaurio
     * @param valor_Compra valor de la compra total
     * @param Monto_pagar  monto dado por la persona para hacer el pago
     */
    public static void main(String[] args) {

        Scanner entradaU = new Scanner(System.in);

        int valor_Compra = 0;
        int Monto_Pagar = 0;

        System.out.println("Ingresa el valor total de la compra: ");
        valor_Compra = entradaU.nextInt();

        System.out.println("Ingresa el monto pagado: ");
        Monto_Pagar = entradaU.nextInt();

        System.out.println("Cambio a regresar: " + (Monto_Pagar - valor_Compra));

    }
}
