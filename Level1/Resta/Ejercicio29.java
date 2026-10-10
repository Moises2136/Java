package Level1.Resta;

/**
 * Clase que obtiene cuantos dias falta para tu cumpleaños
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio29 {

    /**
     * Metodo obtiene cuantos dias faltan para tu cumple
     *
     * @param diaActual     valor int de un numero
     * @param diaCumpleanos valor int de un numero
     * @param diasFaltan    valor int de un numero
     */
    public static void main(String[] args) {

        int diaActual = 10;
        int diaCumpleanos = 25;

        int diasFaltan = diaCumpleanos - diaActual;

        System.out.println("Faltan " + diasFaltan + " días para tu cumpleaños.");

    }
}
