package Level1.Switch;

import java.util.Scanner;

import Level1.Switch.*;

public class SwitchMain {

    public static void main(String[] args) {

        Scanner entradaSw = new Scanner(System.in);

        Ejercicio61 E61 = new Ejercicio61();
        Ejercicio62 E62 = new Ejercicio62();
        Ejercicio63 E63 = new Ejercicio63();
        Ejercicio64 E64 = new Ejercicio64();
        Ejercicio65 E65 = new Ejercicio65();
        Ejercicio66 E66 = new Ejercicio66();
        Ejercicio67 E67 = new Ejercicio67();
        Ejercicio68 E68 = new Ejercicio68();
        Ejercicio69 E69 = new Ejercicio69();
        Ejercicio70 E70 = new Ejercicio70();

        int opcionSw = 0;

        do {

            System.out.println("1. Número a día de la semana" + "\n" +
                    "2. Número a mes del año" + "\n" +
                    "3. Calculadora con switch de operador" + "\n" +
                    "4. Vocal o consonante" + "\n" +
                    "5. Estación del año según el mes" + "\n" +
                    "6. Días que tiene un mes" + "\n" +
                    "7. Menú de restaurante con precios" + "\n" +
                    "8. Convertidor de unidades con menú" + "\n" +
                    "9. Piedra, papel o tijera contra valores fijos" + "\n" +
                    "10. Menú que se repite hasta elegir \"Salir\"" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionSw = entradaSw.nextInt();

            switch (opcionSw) {
                case 1:
                    E61.main(args);
                    break;
                case 2:
                    E62.main(args);
                    break;
                case 3:
                    E63.main(args);
                    break;
                case 4:
                    E64.main(args);
                    break;
                case 5:
                    E65.main(args);
                    break;
                case 6:
                    E66.main(args);
                    break;
                case 7:
                    E67.main(args);
                    break;
                case 8:
                    E68.main(args);
                    break;
                case 9:
                    E69.main(args);
                    break;
                case 10:
                    E70.main(args);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcionSw != 0);

    }

}
