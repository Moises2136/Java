package Level1.Resta;

/**
 * Clase que obtiene la dif de temperatura por dos dias
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio26 {

    /**
     * Metodo obtiene la temperatura
     *
     * @param temp1 temp int de un numero
     * @param temp2 temp int de un numero
     */
    public static void main(String[] args) {

        int temp1 = 15;
        int temp2 = 26;

        System.out.println("La diferencia de temperatura de ayer y hoy fue de: " + Math.abs(temp1 - temp2) + "grados");

    }
}
