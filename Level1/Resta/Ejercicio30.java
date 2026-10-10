package Level1.Resta;

import java.util.Scanner;

/**
 * Clase que obtiene el descuento de un producto
 * 
 * @author Moisés
 * @version 1.0
 */

public class Ejercicio30 {
    public static void main(String[] args) {

        Scanner entradaUser = new Scanner(System.in);

        System.out.println("Ingresa el precio del producto: ");
        int precio = entradaUser.nextInt();

        System.out.println("Ingresa el descuento del prodcuto: ");
        int descuento = entradaUser.nextInt();

        double precio_final = precio * descuento / 100;

        precio_final = precio - precio_final;

        System.out.println("El precio con descuento de " + descuento + "es de " + precio_final);

    }
}
