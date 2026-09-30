package Level2.Strings_y_StringBuilder;

import java.util.Scanner;

import Level2.Strings_y_StringBuilder.*;

public class SSBuildeMain {

    public static void main(String[] args) {

        Scanner entradaSSB = new Scanner(System.in);

        Ejercicio123 E123 = new Ejercicio123();
        Ejercicio124 E124 = new Ejercicio124();
        Ejercicio125 E125 = new Ejercicio125();
        Ejercicio126 E126 = new Ejercicio126();
        Ejercicio127 E127 = new Ejercicio127();
        Ejercicio128 E128 = new Ejercicio128();
        Ejercicio129 E129 = new Ejercicio129();
        Ejercicio130 E130 = new Ejercicio130();
        Ejercicio131 E131 = new Ejercicio131();
        Ejercicio132 E132 = new Ejercicio132();

        int opcionMulti = 0;

        do {

            System.out.println("1. substring para extraer partes" + "\n" +
                    "2. indexOf para buscar texto" + "\n" +
                    "3. split para separar palabras" + "\n" +
                    "4. trim y limpiar espacios" + "\n" +
                    "5. equals vs ==" + "\n" +
                    "6. Invertir palabras de una oración" + "\n" +
                    "7. Anagramas" + "\n" +
                    "8. Capitalizar cada palabra" + "\n" +
                    "9. Comprimir texto (\"aaabb\" → \"a3b2\")" + "\n" +
                    "10. Construir un String grande con StringBuilder" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionMulti = entradaSSB.nextInt();

            switch (opcionMulti) {
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

        } while (opcionMulti != 0);

    }

}
