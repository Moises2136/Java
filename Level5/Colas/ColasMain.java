package Level5.Colas;

import java.util.Scanner;

public class ColasMain {

    public static void main(String[] args) {

        Scanner entradaColas = new Scanner(System.in);

        Ejercicio301 E301 = new Ejercicio301();
        Ejercicio302 E302 = new Ejercicio302();
        Ejercicio303 E303 = new Ejercicio303();
        Ejercicio304 E304 = new Ejercicio304();
        Ejercicio305 E305 = new Ejercicio305();
        Ejercicio306 E306 = new Ejercicio306();
        Ejercicio307 E307 = new Ejercicio307();
        Ejercicio308 E308 = new Ejercicio308();
        Ejercicio309 E309 = new Ejercicio309();
        Ejercicio310 E310 = new Ejercicio310();

        int opcionColas = 0;

        do {

            System.out.println("1. Cola con arreglo" + "\n" +
                    "2. Cola circular" + "\n" +
                    "3. Cola con lista ligada" + "\n" +
                    "4. Simulación de fila en banco" + "\n" +
                    "5. Cola usando dos pilas" + "\n" +
                    "6. Cola de prioridad con PriorityQueue" + "\n" +
                    "7. Deque (doble extremo)" + "\n" +
                    "8. Invertir una cola" + "\n" +
                    "9. Problema de Josephus" + "\n" +
                    "10. Planificador de tareas round robin" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionColas = entradaColas.nextInt();

            switch (opcionColas) {
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

        } while (opcionColas != 0);

    }

}
