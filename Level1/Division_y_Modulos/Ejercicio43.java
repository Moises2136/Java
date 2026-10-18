package Level1.Division_y_Modulos;

/**
 * Clase que obtiene el promedio de 3 calificaciones
 * 
 * @author Moisés
 * @version 1.0
 */
public class Ejercicio43 {

    /**
     * Metodo main que imprime el promedio final
     * @param calificacion1 calificacion de un examen
     * @param calificacion2 calificacion de un examen
     * @param calificacion3 calificacion de un examen
     * @param promedio calificacion total de los examenes
     * 
     */
    public static void main(String[] args) {

        double calificacion1 = 8;
        double calificacion2 = 9;
        double calificacion3 = 7;

        double promedio;

        promedio = (calificacion1 + calificacion2 + calificacion3)/3;

        System.out.println("El promedio de las 3 calificaciones es: " + promedio);

    }
}
