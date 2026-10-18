package Level1.If_else;

import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Clase Tarifa de cine según edad y día
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio60 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        LocalDate fechaActual = LocalDate.now();

        int edad;

        java.time.DayOfWeek diaSemana = fechaActual.getDayOfWeek();

        System.out.println("Introduce tu edad para saber que descuentos hay hoy: ");
        edad = entrada.nextInt();

        if ((diaSemana == DayOfWeek.MONDAY || diaSemana == DayOfWeek.WEDNESDAY || diaSemana == DayOfWeek.FRIDAY)
                && edad >= 18) {
            System.out.println("Hoy dia " + diaSemana + " hay un 20% de descuento");
        } else if ((diaSemana == DayOfWeek.SATURDAY || diaSemana == DayOfWeek.SUNDAY) && edad < 18) {
            System.out.println("Hoy dia " + diaSemana + " los menores a 18 no pagan boleto");

        } else {
            System.out.println("Hoy el descuento de adultos es de 50%");
        }

    }
}
