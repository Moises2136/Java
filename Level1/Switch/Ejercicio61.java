package Level1.Switch;

import java.util.Scanner;

/**
 * Clase Número a día de la semana
 * 
 * @author Moisés
 * @version 1.0
 */

public class Ejercicio61 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el día de la semana: ");

        int dia = entrada.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Hoy es Lunes");
                break;
            case 2:
                System.out.println("Hoy es Martes");
                break;
            case 3:
                System.out.println("Hoy es Miercoles");
                break;
            case 4:
                System.out.println("Hoy es Jueves");
                break;
            case 5:
                System.out.println("Hoy es Viernes");
                break;
            case 6:
                System.out.println("Hoy es Sabado");
                break;
            case 7:
                System.out.println("Hoy es Domigo");
                break;
            default:
                System.out.println("Solo hay 7 días en la semana");
                break;
        }

    }
}
