package Level2.Basico;

import java.util.Scanner;

public class Basico2Main {
    public static void main(String[] args) {

        Scanner entradaBasico2 = new Scanner(System.in);

        Ejercicio153 E153 = new Ejercicio153();
        Ejercicio154 E154 = new Ejercicio154();
        Ejercicio155 E155 = new Ejercicio155();
        Ejercicio156 E156 = new Ejercicio156();
        Ejercicio157 E157 = new Ejercicio157();
        Ejercicio158 E158 = new Ejercicio158();
        Ejercicio159 E159 = new Ejercicio159();
        Ejercicio160 E160 = new Ejercicio160();
        Ejercicio161 E161 = new Ejercicio161();
        Ejercicio162 E162 = new Ejercicio162();
        Ejercicio163 E163 = new Ejercicio163();
        Ejercicio164 E164 = new Ejercicio164();
        Ejercicio165 E165 = new Ejercicio165();

        int opcionBasico2 = 0;

        do {

            System.out.println("1. Máximo y mínimo de un arreglo" + "\n" +
                    "2. Promedio de un arreglo" + "\n" +
                    "3. Invertir un arreglo" + "\n" +
                    "4. Buscar un elemento" + "\n" +
                    "5. Palíndromo (el que ya empezaste)" + "\n" +
                    "6. Contar vocales" + "\n" +
                    "7. Invertir las palabras de una oración" + "\n" +
                    "8. ¿Son anagramas?" + "\n" +
                    "9. Eliminar duplicados" + "\n" +
                    "10. Rotar un arreglo k posiciones" + "\n" +
                    "11. Primer carácter que no se repite" + "\n" +
                    "12. Suma y transpuesta de matrices" + "\n" +
                    "13. ¿Hubo lotería?" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionBasico2 = entradaBasico2.nextInt();

            switch (opcionBasico2) {
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
                case 11:
                case 12:
                case 13:
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcionBasico2 != 0);

    }

}
