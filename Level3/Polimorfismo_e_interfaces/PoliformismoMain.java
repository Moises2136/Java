package Level3.Polimorfismo_e_interfaces;

import java.util.Scanner;

public class PoliformismoMain {

    public static void main(String[] args) {

        Scanner entradaPoliformismo = new Scanner(System.in);

        Ejercicio196 E196 = new Ejercicio196();
        Ejercicio197 E197 = new Ejercicio197();
        Ejercicio198 E198 = new Ejercicio198();
        Ejercicio199 E199 = new Ejercicio199();
        Ejercicio200 E200 = new Ejercicio200();
        Ejercicio201 E201 = new Ejercicio201();
        Ejercicio202 E202 = new Ejercicio202();
        Ejercicio203 E203 = new Ejercicio203();
        Ejercicio204 E204 = new Ejercicio204();
        Ejercicio205 E205 = new Ejercicio205();

        int opcionPoliformismo = 0;

        do {

            System.out.println("1. Interfaz Figura con area()" + "\n" +
                    "2. Arreglo de figuras distintas" + "\n" +
                    "3. Interfaz Sonido para animales" + "\n" +
                    "4. Clase que implementa dos interfaces" + "\n" +
                    "5. Sobrecarga vs sobrescritura" + "\n" +
                    "6. instanceof y casting" + "\n" +
                    "7. Interfaz Pagable (empleados y facturas)" + "\n" +
                    "8. Comparable para ordenar objetos" + "\n" +
                    "9. Comparator para ordenar por varios criterios" + "\n" +
                    "10. equals y hashCode" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionPoliformismo = entradaPoliformismo.nextInt();

            switch (opcionPoliformismo) {
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

        } while (opcionPoliformismo != 0);

    }

}
