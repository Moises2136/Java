package Level3.Basico;

import java.util.Scanner;

public class Basico3Main {

    public static void main(String[] args) {

        Scanner entradaBasico3 = new Scanner(System.in);

        Ejercicio226 E226 = new Ejercicio226();
        Ejercicio227 E227 = new Ejercicio227();
        Ejercicio228 E228 = new Ejercicio228();
        Ejercicio229 E229 = new Ejercicio229();
        Ejercicio230 E230 = new Ejercicio230();
        Ejercicio231 E231 = new Ejercicio231();
        Ejercicio232 E232 = new Ejercicio232();
        Ejercicio233 E233 = new Ejercicio233();
        Ejercicio234 E234 = new Ejercicio234();
        Ejercicio235 E235 = new Ejercicio235();
        Ejercicio236 E236 = new Ejercicio236();
        Ejercicio237 E237 = new Ejercicio237();

        int opcionBasico3 = 0;

        do {

            System.out.println("1. Clase Persona con getters y setters" + "\n" +
                    "2. CuentaBancaria con depósitos, retiros y validaciones" + "\n" +
                    "3. Rectangulo y Circulo con área y perímetro" + "\n" +
                    "4. Herencia: Animal → Perro, Gato" + "\n" +
                    "5. Interfaz Figura con polimorfismo" + "\n" +
                    "6. Clase abstracta Empleado con sueldo por tipo" + "\n" +
                    "7. Excepción propia SaldoInsuficienteException" + "\n" +
                    "8. Sistema de biblioteca: libros, usuarios y préstamos" + "\n" +
                    "9. Inventario de tienda con ArrayList" + "\n" +
                    "10. Juego de cartas: Carta, Baraja, Mano (barajar y repartir)" + "\n" +
                    "11. equals, hashCode y Comparable" + "\n" +
                    "12. Patrones Singleton y Factory" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionBasico3 = entradaBasico3.nextInt();

            switch (opcionBasico3) {
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
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcionBasico3 != 0);

    }

}
