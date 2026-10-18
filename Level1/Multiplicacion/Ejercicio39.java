package Level1.Multiplicacion;

/**
 * Clase que calcula el Sueldo semanal: horas × pago por hora
 * 
 * @author Moisés
 * @version 1.0
 */

public class Ejercicio39 {
    /**
     * Metodo main que imprime el sueldo de la semana
     * @param sueldo_S Sueldo x hora a la semana
     * @param horas horas a la semana que se trabaja
     * @param sueldo_T sueldo total ganado a la semana
     */
    public static void main(String[] args) {

        double sueldo_S = 123.45;
        int horas = 30;

        double sueldo_T;

        sueldo_T = sueldo_S * horas;

        System.out.println("El sueldo a la semana es de: " + sueldo_T);

    }
}
