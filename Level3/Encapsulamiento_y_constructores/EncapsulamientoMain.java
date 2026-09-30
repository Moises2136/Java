package Level3.Encapsulamiento_y_constructores;

import java.util.Scanner;

public class EncapsulamientoMain {

    public static void main(String[] args) {

        Scanner entradaEncap = new Scanner(System.in);

        Ejercicio176 E176 = new Ejercicio176();
        Ejercicio177 E177 = new Ejercicio177();
        Ejercicio178 E178 = new Ejercicio178();
        Ejercicio179 E179 = new Ejercicio179();
        Ejercicio180 E180 = new Ejercicio180();
        Ejercicio181 E181 = new Ejercicio181();
        Ejercicio182 E182 = new Ejercicio182();
        Ejercicio183 E183 = new Ejercicio183();
        Ejercicio184 E184 = new Ejercicio184();
        Ejercicio185 E185 = new Ejercicio185();

        int opcionEncap = 0;

        do {

            System.out.println("1. Getters y setters en Persona" + "\n" +
                    "2. Validar edad en el setter" + "\n" +
                    "3. Varios constructores (sobrecarga)" + "\n" +
                    "4. this en constructores" + "\n" +
                    "5. CuentaBancaria con saldo privado" + "\n" +
                    "6. Retiro que no deje saldo negativo" + "\n" +
                    "7. Atributo static para contar objetos" + "\n" +
                    "8. Método static utilitario" + "\n" +
                    "9. Clase inmutable con final" + "\n" +
                    "10. Producto con precio e inventario validados" + "\n" +
                    "0. Salir");

            System.out.println("Seleccione una opción del menú:");

            opcionEncap = entradaEncap.nextInt();

            switch (opcionEncap) {
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

        } while (opcionEncap != 0);

    }

}
