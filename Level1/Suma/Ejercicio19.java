package Level1.Suma;

/**
 * Clase que suma tiempo
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio19 {

    /**
     * Metodo para tener el total del tiempo
     *
     * @param time1h hora 1
     * @param time2h hora 2
     * @param timeh  hora
     * @param time1m minutos 1
     * @param time2m minutos 2
     * @param timem  minutos
     * @param timeF  tiempo final en Horas
     */
    public static void main(String[] args) {

        int time1h = 1;
        int time2h = 2;

        int time1m = 50;
        int time2m = 30;

        int timeh = (time1m + time2m) / 60;
        int timem = (time1m + time2m) % 60;

        int timeF = time1h + time2h + timeh;

        System.out.println("La suma total de tiempo es: " + timeF + "H" + timem + "m");

    }
}
