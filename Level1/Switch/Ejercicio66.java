package Level1.Switch;

import java.util.Scanner;

/**
 * Clase Días que tiene un mes
 * 
 * @author Moisés
 * @version 1.0
 */

public class Ejercicio66 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el mes para saber cuantos dias tiene(Enero ... Diciembre): ");
        String mes_d = entrada.nextLine();

        switch (mes_d) {
            case "Enero":
                System.out.println("Enero tiene 31 días");
                break;
            case "Febrero":
                System.out.println("Febrero tiene 28 días");
                break;
            case "Marzo":
                System.out.println("Marzo tiene 31 días");
                break;
            case "Abril":
                System.out.println("Abril tiene 30 días");
                break;
            case "Mayo":
                System.out.println("Mayo tiene 31 días");
                break;
            case "Junio":
                System.out.println("Junio tiene 30 días");
                break;
            case "Julio":
                System.out.println("Julio tiene 31 días");
                break;
            case "Agosto":
                System.out.println("Agosto tiene 31 días");
                break;
            case "Septiembre":
                System.out.println("Septiembre tiene 30 días");
                break;
            case "Octubre":
                System.out.println("Octubre tiene 31 días");
                break;
            case "Noviembre":
                System.out.println("Noviembre tiene 30 días");
                break;
            case "Diciembre":
                System.out.println("Diciembre tiene 31 días");
                break;
            default:
                System.out.println("Este mes no existe");
                break;
        }

    }
}
