package Level1.Division_y_Modulos;

/**
 * Clase que Convertir segundos a horas, minutos y segundos
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio46 {

    /**
     * Metodo main que imprime la conversion de tiempo
     * @param segundos1 valor int
     * @param horas1 valor int
     */
    public static void main(String[] args) {

        int segundos1= 18000;
        int horas1 = 5;

        System.out.println("Segundos a Horas: " + (segundos1 / 3600) + " horas");
        System.out.println("Segundos a minutos: " + ((segundos1 % 3600) / 60) + " minutos");

        System.out.println("Horas a minutos: " + (horas1 * 60) + " minutos");
        System.out.println("Horas a segundos: " + (horas1 * 3600) + " segundos");

    }
}
