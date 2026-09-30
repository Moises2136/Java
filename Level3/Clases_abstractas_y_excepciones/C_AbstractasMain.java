package Level3.Clases_abstractas_y_excepciones;

import java.util.Scanner;

public class C_AbstractasMain {

    public static void main(String[] args) {

        Scanner entradaC_Abs = new Scanner(System.in);

        Ejercicio206 E206 = new Ejercicio206();
        Ejercicio207 E207 = new Ejercicio207();
        Ejercicio208 E208 = new Ejercicio208();
        Ejercicio209 E209 = new Ejercicio209();
        Ejercicio210 E210 = new Ejercicio210();
        Ejercicio211 E211 = new Ejercicio211();
        Ejercicio212 E212 = new Ejercicio212();
        Ejercicio213 E213 = new Ejercicio213();
        Ejercicio214 E214 = new Ejercicio214();
        Ejercicio215 E215 = new Ejercicio215();

        int opcionC_Abs = 0;

        do {

            System.out.println("1. Clase abstracta Empleado" + "\n" +
                    "2. Método abstracto calcularSueldo" + "\n" +
                    "3. Abstracta vs interfaz: mismo problema de dos formas" + "\n" +
                    "4. try/catch con división entre cero" + "\n" +
                    "5. try/catch con índice fuera de rango" + "\n" +
                    "6. finally" + "\n" +
                    "7. Validar entrada con NumberFormatException" + "\n" +
                    "8. Excepción propia SaldoInsuficienteException" + "\n" +
                    "9. throws en un método" + "\n" +
                    "10. Varias excepciones en un mismo try" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionC_Abs = entradaC_Abs.nextInt();

            switch (opcionC_Abs) {
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

        } while (opcionC_Abs != 0);

    }

}
