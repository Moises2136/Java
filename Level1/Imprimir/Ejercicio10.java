package Level1.Imprimir;

/**
 * Clase imprime Datos en forma de una tabla
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio10 {

    /**
     * Meotodo que imprime datos con printf como una tabla
     *
     * @param nombre     imprime un nombre
     * @param edad       imprime una edad
     * @param porcentaje imprime un porcentaje
     * @param estudiante imprime un boolean
     */
    public static void main(String[] args) {

        String nombre = "Moises";
        int edad = 22;
        double porcentaje = 98.10;
        boolean estudiante = true;

        System.out.printf("Nombre: %s%nEdad: %d%nCalificación: %.2f%nEs estudiante: %b%n", nombre, edad, porcentaje,
                estudiante);
    }
}
