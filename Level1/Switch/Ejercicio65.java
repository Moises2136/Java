package Level1.Switch;

import java.util.Scanner;

/**
 * Clase Estación del año según el mes
 * 
 * @author Moisés
 * @version 1.0
 */

public class Ejercicio65 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out
                .println("Introduce el mes para saber en que estación del año estamos (Enero, Febrero ... Diciembre)");

        String estacion_año = entrada.nextLine();

        switch (estacion_año) {
            case "Diciembre":
            case "Enero":
            case "Febrero":
                System.out.println("Estamos en Invierno");
                break;
            case "Marzo":
            case "Abril":
            case "Mayo":
                System.out.println("Estamos en Primavera");
                break;
            case "Junio":
            case "Julio":
            case "Agosto":
                System.out.println("Estamos en Verano");
                break;
            case "Septiembre":
            case "Octubre":
            case "Noviembre":
                System.out.println("Estamos en Otoño");
                break;
            default:
                System.out.println("Mes desconocido");
                break;
        }

    }
}
