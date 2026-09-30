package Level5.Basico;

import java.util.Scanner;

public class Basico5Main {

    public static void main(String[] args) {

        Scanner entradaBasico5 = new Scanner(System.in);

        Ejercicio321 E321 = new Ejercicio321();
        Ejercicio322 E322 = new Ejercicio322();
        Ejercicio323 E323 = new Ejercicio323();
        Ejercicio324 E324 = new Ejercicio324();
        Ejercicio325 E325 = new Ejercicio325();
        Ejercicio326 E326 = new Ejercicio326();
        Ejercicio327 E327 = new Ejercicio327();
        Ejercicio328 E328 = new Ejercicio328();
        Ejercicio329 E329 = new Ejercicio329();
        Ejercicio330 E330 = new Ejercicio330();
        Ejercicio331 E331 = new Ejercicio331();
        Ejercicio332 E332 = new Ejercicio332();
        Ejercicio333 E333 = new Ejercicio333();

        int opcionBasico5 = 0;

        do {

            System.out.println("1. Lista ligada simple desde cero" + "\n" +
                    "2. Invertir una lista ligada" + "\n" +
                    "3. Detectar ciclo en lista ligada" + "\n" +
                    "4. Lista doblemente ligada" + "\n" +
                    "5. Pila con arreglo" + "\n" +
                    "6. Paréntesis balanceados" + "\n" +
                    "7. Cola circular con arreglo" + "\n" +
                    "8. Cola usando dos pilas" + "\n" +
                    "9. Two Sum con HashMap" + "\n" +
                    "10. Frecuencia de palabras en un texto" + "\n" +
                    "11. Evaluar expresión postfija" + "\n" +
                    "12. Tu propio HashMap sencillo" + "\n" +
                    "13. LRU Cache" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionBasico5 = entradaBasico5.nextInt();

            switch (opcionBasico5) {
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

        } while (opcionBasico5 != 0);

    }

}
