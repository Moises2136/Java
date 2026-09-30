package Level1.Division_y_Modulos;

import java.util.Scanner;

import Level1.Division_y_Modulos.*;

public class Div_ModMain {

    public static void main(String[] args) {

        Scanner entradaDivM = new Scanner(System.in);

        Ejercicio41 E41 = new Ejercicio41();
        Ejercicio42 E42 = new Ejercicio42();
        Ejercicio43 E43 = new Ejercicio43();
        Ejercicio44 E44 = new Ejercicio44();
        Ejercicio45 E45 = new Ejercicio45();
        Ejercicio46 E46 = new Ejercicio46();
        Ejercicio47 E47 = new Ejercicio47();
        Ejercicio48 E48 = new Ejercicio48();
        Ejercicio49 E49 = new Ejercicio49();
        Ejercicio50 E50 = new Ejercicio50();

        int opcionDivM = 0;

        do {

            System.out.println("1. Divide dos números fijos" + "\n" +
                    "2. División entera vs. decimal: 7 / 2 contra 7.0 / 2" + "\n" +
                    "3. Promedio de tres calificaciones" + "\n" +
                    "4. Residuo con %" + "\n" +
                    "5. Par o impar usando %" + "\n" +
                    "6. Convertir segundos a horas, minutos y segundos" + "\n" +
                    "7. Repartir una cuenta entre n personas" + "\n" +
                    "8. Qué pasa al dividir entre cero con int y con double" + "\n" +
                    "9. Separar los dígitos de un número de 3 cifras con / y %" + "\n" +
                    "10. Convertir un double a int (casting) y ver qué se pierde" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionDivM = entradaDivM.nextInt();

            switch (opcionDivM) {
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

        } while (opcionDivM != 0);

    }

}
