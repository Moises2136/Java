package Level3.Proyectos_POO;

import java.util.Scanner;

public class POO_PMain {

    public static void main(String[] args) {

        Scanner entradaPOO = new Scanner(System.in);

        Ejercicio216 E216 = new Ejercicio216();
        Ejercicio217 E217 = new Ejercicio217();
        Ejercicio218 E218 = new Ejercicio218();
        Ejercicio219 E219 = new Ejercicio219();
        Ejercicio220 E220 = new Ejercicio220();
        Ejercicio221 E221 = new Ejercicio221();
        Ejercicio222 E222 = new Ejercicio222();
        Ejercicio223 E223 = new Ejercicio223();
        Ejercicio224 E224 = new Ejercicio224();
        Ejercicio225 E225 = new Ejercicio225();

        int opcionPOO = 0;

        do {

            System.out.println("1. Biblioteca con préstamos" + "\n" +
                    "2. Inventario de tienda" + "\n" +
                    "3. Sistema de calificaciones" + "\n" +
                    "4. Cajero automático" + "\n" +
                    "5. Agenda de contactos" + "\n" +
                    "6. Baraja: barajar y repartir" + "\n" +
                    "7. Estacionamiento con cobro por tiempo" + "\n" +
                    "8. Reservas de cine" + "\n" +
                    "9. Lotería simple en consola" + "\n" +
                    "10. Patrones Singleton y Factory" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionPOO = entradaPOO.nextInt();

            switch (opcionPOO) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcionPOO != 0);

    }

}
