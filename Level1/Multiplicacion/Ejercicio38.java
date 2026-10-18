package Level1.Multiplicacion;

/**
 * Clase que convierte horas, minutos y segundos
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio38 {

    /**
     * Metodo main que imprime los minutos y segundos de una hora especfica
     * @param segundos segundos de la hora
     * @param minutos minutos de una hora
     * @param s los segundos totales
     * @param m los minutos totales 
     */
    public static void main(String[] args) {

        int segundos = 60;
        int minutos = 60;

        int horas = 5;

        int s;
        int m;

        m = horas * minutos;
        s = m * segundos;

        System.out.println("El total de 5 horas son: " + m + " minutos y " + s + " segundos");

    }
}
