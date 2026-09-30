package Level3.Clases_y_Objetos;

import java.util.Scanner;

public class Clases_Objetos_Main {

    public static void main(String[] args) {

        Scanner entradaCO = new Scanner(System.in);

        Ejercicio166 E166 = new Ejercicio166();
        Ejercicio167 E167 = new Ejercicio167();
        Ejercicio168 E168 = new Ejercicio168();
        Ejercicio169 E169 = new Ejercicio169();
        Ejercicio170 E170 = new Ejercicio170();
        Ejercicio171 E171 = new Ejercicio171();
        Ejercicio172 E172 = new Ejercicio172();
        Ejercicio173 E173 = new Ejercicio173();
        Ejercicio174 E174 = new Ejercicio174();
        Ejercicio175 E175 = new Ejercicio175();

        int opcionCO = 0;

        do {

            System.out.println("1. Clase Persona con atributos" + "\n" +
                    "2. Clase Auto con métodos" + "\n" +
                    "3. Clase Libro con toString" + "\n" +
                    "4. Clase Rectangulo con área y perímetro" + "\n" +
                    "5. Clase Circulo" + "\n" +
                    "6. Clase Alumno con promedio" + "\n" +
                    "7. Clase Reloj que avanza segundos" + "\n" +
                    "8. Clase Punto con distancia entre puntos" + "\n" +
                    "9. Clase Fraccion con suma y simplificar" + "\n" +
                    "10. Clase Contador con incrementar y reiniciar" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionCO = entradaCO.nextInt();

            switch (opcionCO) {
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

        } while (opcionCO != 0);

    }

}
